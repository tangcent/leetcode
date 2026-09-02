#!/usr/bin/env python3

import os
import re
import shutil
from pathlib import Path

def extract_class_definitions(content):
    """Extract class definitions from comments based on indentation and class definition patterns."""
    definitions = []
    lines = content.split('\n')
    i = 0
    
    while i < len(lines):
        line = lines[i]
        
        # Look for the start of a class definition in comments
        if line.strip().startswith('* public class'):
            # Get the indentation level
            indent = len(line) - len(line.lstrip())
            # Get class name - extract the word after "public class"
            parts = line.strip().split()
            class_name = parts[parts.index('class') + 1]
            class_body = []
            
            # Collect lines until we find the matching closing brace
            j = i + 1
            while j < len(lines):
                current_line = lines[j]
                current_indent = len(current_line) - len(current_line.lstrip())
                
                # If we find a line with the same indentation level and "* }", we've found the end
                if current_indent == indent and current_line.strip() == '* }':
                    break
                
                # Add the line to the class body, removing the "* " prefix
                if current_line.strip().startswith('*'):
                    class_body.append(current_line.replace('* ', '', 1))
                elif current_line.strip():  # If it's a non-empty line without "*", add it as is
                    class_body.append(current_line)
                
                j += 1
            
            # Add the class definition
            if class_body:
                definitions.append((class_name, '\n'.join(class_body)))
            
            i = j + 1  # Move past the closing brace
            continue
            
        i += 1
    
    return definitions

def process_file(file_path):
    """Process a single Java file and organize it with its definition classes."""
    # Get file information
    filename = os.path.basename(file_path)
    problem_number = re.match(r'^(\d+)', filename)
    if not problem_number:
        print(f"Skipping file with unrecognized format: {filename}")
        return
    
    problem_number = problem_number.group(1)
    problem_name = re.sub(r'^\d+\.', '', filename).replace('.java', '')
    
    # Create directory name
    dir_name = f"leetcode_{problem_number}_{problem_name}"
    dir_name = dir_name.replace('-', '_')
    package_name = f"com.itangcent.{dir_name}"
    
    # Create target directory
    target_dir = os.path.join(os.path.dirname(file_path), dir_name)
    os.makedirs(target_dir, exist_ok=True)
    
    # Read the original file
    with open(file_path, 'r') as f:
        content = f.read()
    
    # Extract class definitions
    definitions = extract_class_definitions(content)
    
    # Create definition class files
    for class_name, class_body in definitions:
        def_file_path = os.path.join(target_dir, f"{class_name}.java")
        with open(def_file_path, 'w') as f:
            f.write(f"package {package_name};\n\n")
            f.write(f"public class {class_name} {{\n")
            f.write(class_body)
            f.write("\n}\n")
        print(f"Created definition class: {def_file_path}")
    
    # Create Solution.java
    solution_path = os.path.join(target_dir, "Solution.java")
    with open(solution_path, 'w') as f:
        # Write package declaration
        f.write(f"package {package_name};\n\n")
        
        # Write imports for definition classes
        for class_name, _ in definitions:
            f.write(f"import {package_name}.{class_name};\n")
        f.write("\n")
        
        # Write the solution class, removing the original package declaration
        solution_content = re.sub(r'^package.*;\n', '', content, flags=re.MULTILINE)
        f.write(solution_content)
    
    print(f"Created Solution.java: {solution_path}")
    
    # Create SolutionTest.java
    test_path = os.path.join(target_dir, "SolutionTest.java")
    with open(test_path, 'w') as f:
        f.write(f"""package {package_name};

/**
 * Test class for the solution to LeetCode problem #{problem_number}: {problem_name}
 */
public class SolutionTest {{
    public static void main(String[] args) {{
        Solution solution = new Solution();
        
        // TODO: Add test cases
        System.out.println("Running tests for LeetCode problem #{problem_number}: {problem_name}");
        
        // Example test case
        // Replace these with actual test cases for the specific problem
        // System.out.println("Expected: X, Actual: " + solution.methodName(args));
    }}
}}
""")
    print(f"Created SolutionTest.java: {test_path}")
    
    # Remove the original file
    os.remove(file_path)
    print(f"Removed original file: {file_path}")

def main():
    # Directory to process
    target_dir = "java/src/main/java/com/itangcent"
    
    # Change to the workspace directory
    os.chdir(os.path.dirname(os.path.abspath(__file__)))
    
    # Process all Java files in the target directory
    for file in os.listdir(target_dir):
        if file.endswith('.java') and not os.path.isdir(os.path.join(target_dir, file)):
            file_path = os.path.join(target_dir, file)
            print(f"\nProcessing file: {file}")
            process_file(file_path)
    
    print("\nOrganization complete!")

if __name__ == "__main__":
    main() 