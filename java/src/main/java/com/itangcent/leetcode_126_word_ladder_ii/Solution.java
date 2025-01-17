package com.itangcent.leetcode_126_word_ladder_ii;


/*
 * @lc app=leetcode id=126 lang=java
 *
 * [126] Word Ladder II
 */

import java.util.*;
import java.util.stream.Collectors;

// @lc code=start
class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return Collections.emptyList();
        }
        Map<String, Template> templates = new HashMap<>();
        Map<String, Word> words = new HashMap<>();

        buildTemplate(beginWord, templates, words);
        for (String word : wordList) {
            if (word.equals(beginWord)) {
                continue;
            }
            buildTemplate(word, templates, words);
        }

        words.get(beginWord).startDistance = 0;
        words.get(endWord).endDistance = 0;
        int minSteps = reverseVisit(beginWord, endWord, words, true);
        if (minSteps == -1) {
            return Collections.emptyList();
        }
        reverseVisit(endWord, beginWord, words, false);

        LinkedList<LinkedList<String>> paths = new LinkedList<>();
        paths.add(new LinkedList<>(Collections.singletonList(beginWord)));

        int step = 1;
        boolean completed = false;
        while (!paths.isEmpty()) {
            int size = paths.size();
            for (int i = 0; i < size; i++) {
                LinkedList<String> path = paths.poll();
                Word word = words.get(path.peekLast());
                if (word == null) {
                    continue;
                }
                boolean isSingleNext = word.isSingleNext();
                for (String nextWord : word.nextWords()) {
                    if (nextWord.equals(endWord)) {
                        completed = true;
                    } else {
                        if (completed) continue;
                        Word nextWordIns = words.get(nextWord);
                        if (nextWordIns.startDistance != step
                                || nextWordIns.endDistance == Integer.MAX_VALUE
                                || (nextWordIns.startDistance + nextWordIns.endDistance + 1 > minSteps)) {
                            continue;
                        }
                    }

                    LinkedList<String> newPath = isSingleNext ? path : new LinkedList<>(path);
                    newPath.add(nextWord);
                    paths.add(newPath);
                }
            }
            if (completed) {
                return paths.stream()
                        .filter(path -> path.peekLast().equals(endWord))
                        .map(path -> (List<String>) path)
                        .collect(Collectors.toList());
            }
            ++step;
        }
        return Collections.emptyList();
    }

    private int reverseVisit(String fromWord,
                             String toWord,
                             Map<String, Word> words,
                             boolean isForward) {
        Set<String> processed = new HashSet<>();
        LinkedList<String> workList = new LinkedList<>();
        workList.add(fromWord);
        boolean completed = false;
        int step = 1;
        while (!workList.isEmpty() && !completed) {
            int size = workList.size();
            for (int i = 0; i < size; i++) {
                String word = workList.poll();
                for (String nextWord : words.get(word).nextWords()) {
                    if (nextWord.equals(toWord)) {
                        completed = true;
                    } else if (completed || !processed.add(nextWord)) {
                        continue;
                    }

                    Word next = words.get(nextWord);
                    if (next != null) {
                        if (isForward) {
                            next.startDistance = Math.min(next.startDistance, step);
                        } else {
                            next.endDistance = Math.min(next.endDistance, step);
                        }
                        workList.add(nextWord);
                    }
                }
            }
            ++step;
        }
        if (!completed) {
            return -1;
        }
        return step;
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

        int endDistance = Integer.MAX_VALUE;

        int startDistance = Integer.MAX_VALUE;

        List<Template> templates = new ArrayList<>();

        boolean isSingleNext() {
            return nextWords().size() == 1;
        }

        private Set<String> nextWords = null;

        private Set<String> nextWords() {
            if (nextWords == null) {
                Set<String> result = new HashSet<>();
                for (Template template : templates) {
                    result.addAll(template.words);
                }
                result.remove(this.word);
                this.nextWords = result;
            }
            return nextWords;
        }
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

