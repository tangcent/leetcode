package com.itangcent.leetcode_68_text_justification;
/*
 * @lc app=leetcode id=68 lang=java
 *
 * [68] Text Justification
 */

import java.util.ArrayList;
import java.util.List;

// @lc code=start
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int wordsCnt = words.length;

        List<String> result = new ArrayList<>(wordsCnt / 2);

        Range range = new Range(words, maxWidth);

        for (int i = 0; i < wordsCnt; i++) {
            if (range.tryAppend(i)) {
                continue;
            }

            result.add(range.buildLine());
            range.reset();
            range.tryAppend(i);
        }

        result.add(range.buildLatestLine());
        return result;
    }

    private static class Range {
        String[] words;
        int maxWidth;

        public Range(String[] words, int maxWidth) {
            this.words = words;
            this.maxWidth = maxWidth;
        }

        StringBuilder sb = new StringBuilder(maxWidth);
        int start = -1;
        int end = -1;
        int wordsLen = 0;

        boolean tryAppend(int value) {
            int newWordsLen = wordsLen + words[value].length() + (start == -1 ? 0 : 1);
            if (newWordsLen > maxWidth) {
                return false;
            }
            if (start == -1) {
                start = value;
            }
            end = value;
            this.wordsLen = newWordsLen;
            return true;
        }

        void reset() {
            start = -1;
            end = -1;
            wordsLen = 0;
        }

        String buildLine() {
            sb.setLength(0);

            if (end == start) {
                sb.append(words[start]);
                appendSpace(maxWidth - wordsLen);
                return sb.toString();
            }

            int cnt = end - start;
            int space = maxWidth - wordsLen + cnt;
            int avgSpace = (space - 1) / cnt;
            int extraSpace = space - avgSpace * cnt;

            for (int j = start; j < end; j++) {
                sb.append(words[j]);
                appendSpace(avgSpace);
                if (extraSpace-- > 0) {
                    sb.append(' ');
                }
            }
            sb.append(words[end]);
            return sb.toString();
        }

        String buildLatestLine() {
            sb.setLength(0);
            for (int i = start; i <= end; i++) {
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(words[i]);
            }
            appendSpace(maxWidth - sb.length());
            return sb.toString();
        }

        private void appendSpace(int space) {
            for (int i = 0; i < space; i++) {
                sb.append(' ');
            }
        }
    }
}
// @lc code=end

