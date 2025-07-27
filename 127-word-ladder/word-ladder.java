class Solution {
    class Pair {
        String word;
        int steps;

        Pair(String word, int steps) {
            this.word = word;
            this.steps = steps;
        }
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(beginWord, 1));

        Set<String> wordSet = new HashSet<>(wordList);

        if (!wordSet.contains(endWord)) return 0;

        while (!q.isEmpty()) {
            Pair p = q.poll();
            String word = p.word;
            int steps = p.steps;

            if (word.equals(endWord)) return steps;

            char[] chars = word.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                char original = chars[i];

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    if (ch == original) continue;

                    chars[i] = ch;
                    String newWord = new String(chars);

                    if (wordSet.contains(newWord)) {
                        wordSet.remove(newWord);
                        q.offer(new Pair(newWord, steps + 1));
                    }
                }
// ye isliy kyuki last me z hai toh fr 2nd itwration ke loye z hin chla jyega
                chars[i] = original; // restore original letter
            }
        }

        return 0;
    }
}