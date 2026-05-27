class Solution {
    public int numberOfSpecialChars(String word) {
        char s[] = word.toCharArray();
        int cnt = 0;
        int lower[] = new int[26];
        int upper[] = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);
        for (int i = 0; i < s.length; i++) {
            char ch = s[i];
            if (Character.isLowerCase(ch)) {
                lower[ch - 'a'] = Math.max(lower[ch - 'a'], i);
            }
            else {
                if (upper[ch - 'A'] == -1)
                    upper[ch - 'A'] = i;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (upper[i] != -1) {
                if (lower[i] != -1 && (lower[i] < upper[i]))
                    cnt++;
            }
        }
        return cnt;
    }
}