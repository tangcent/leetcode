package com.itangcent.leetcode_127_word_ladder;


/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

import java.util.*;

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String, Template> templates = new HashMap<>();
        Map<String, Word> words = new HashMap<>();

        buildTemplate(beginWord, templates, words);
        for (String word : wordList) {
            buildTemplate(word, templates, words);
        }

        int step = 1;
        Set<String> currWords = new HashSet<>(Collections.singletonList(beginWord));
        Set<String> processed = new HashSet<>(currWords);
        while (!currWords.isEmpty()) {
            ++step;
            Set<String> nextWords = new HashSet<>(currWords.size());
            for (String currWord : currWords) {
                Word word = words.get(currWord);
                if (word == null) {
                    continue;
                }
                for (Template template : word.templates) {
                    for (String nextWord : template.words) {
                        if (!processed.add(nextWord)) {
                            continue;
                        }
                        if (nextWord.equals(endWord)) {
                            return step;
                        }
                        nextWords.add(nextWord);
                    }
                }
            }
            currWords = nextWords;
        }
        return 0;
    }

    private void buildTemplate(String word, Map<String, Template> templates, Map<String, Word> words) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char old = chars[i];
            chars[i] = '*';

            String template = new String(chars);
            Template t = templates.computeIfAbsent(template, k -> new Template(template));
            t.words.add(word);
            Word w = words.computeIfAbsent(word, k -> new Word(word));
            w.templates.add(t);

            chars[i] = old;
        }
    }


    private static class Word {
        public Word(String word) {
            this.word = word;
        }

        String word;
        List<Template> templates = new ArrayList<>();
    }

    private static class Template {
        String template;
        List<String> words = new ArrayList<>();

        public Template(String template) {
            this.template = template;
        }
    }
}
// @lc code=end

