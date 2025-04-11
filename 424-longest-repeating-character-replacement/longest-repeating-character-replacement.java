class Solution {
    public int characterReplacement(String s, int k) {
    int maxlen = 0;

    for (char target = 'A'; target <= 'Z'; target++) {
        int l = 0, count = 0;

        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) != target) {
                count++;
            }

            while (count > k) {
                if (s.charAt(l) != target) {
                    count--;
                }
                l++;
            }

            maxlen = Math.max(maxlen, r - l + 1);
        }
    }

    return maxlen;
}
}