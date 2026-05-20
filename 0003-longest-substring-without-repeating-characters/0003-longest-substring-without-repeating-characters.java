class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        char str[] = s.toCharArray();
        int i = 0, j = 0;
        int n = str.length;
        int maxLen = 0;
        while (j < n) {
            if (!hs.contains(str[j])) {
                maxLen = Math.max(maxLen, j - i + 1);
                hs.add(str[j++]);
            }
            else {
                hs.remove(str[i++]);
            }
        }
        return maxLen;
    }
}