class Solution {
    public int characterReplacement(String s, int k) {
        char str[] = s.toCharArray();
        int freq[] = new int[26];
        int maxF = 0, len = 0;
        int i = 0, j = 0;
        while (j < str.length) {
            freq[str[j] - 'A']++;
            maxF = Math.max(maxF, freq[str[j] - 'A']);
            while (((j - i + 1) - maxF) > k) {
                freq[str[i] - 'A']--;
                i++;
            }
            len = Math.max(len, j - i + 1);
            j++;
        }
        return len;
    }
}