class Solution {
    public int numberOfSpecialChars(String word) {
        int cnt = 0;
        char s[] = word.toCharArray();
        int n = s.length;
        HashSet<Character> hs = new HashSet<>();
        HashSet<Character> visited = new HashSet<>();
        for (int i = 0; i < n; i++) {
            char ch = s[i];
            char c = (char)(ch ^ 32);
            if (hs.contains(c) && !visited.contains(ch)) {
                cnt++;
                visited.add(c);
                visited.add(ch);
            }
            hs.add(ch);
        }
        return cnt;
    }
}