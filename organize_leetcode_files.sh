#!/bin/bash

# Change to the workspace directory
cd "$(dirname "$0")"

# Run the Python script with version-based python3 detection
if python3 -V >/dev/null 2>&1; then
    echo "Using python3 
    (version: $(python3 -V 2>&1))"
    python3 organize_leetcode_files.py || {
        echo "python3 failed, trying python..."
        python organize_leetcode_files.py
    }
else
    echo "python3 not found, using python"
    python organize_leetcode_files.py
fi

echo "Organization complete!"
