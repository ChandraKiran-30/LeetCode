class Solution {
    public boolean checkStrings(String s1, String s2) {
        char even[] = new char[26];
        char odd[] = new char[26];
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n; i++) {
            char ch = s1.charAt(i);
            if (i % 2 == 0) {
                even[ch - 'a']++;
            }
            else {
                odd[ch - 'a']++;
            }
        }
        for (int i = 0; i < m; i++) {
            char ch = s2.charAt(i);
            if (i % 2 == 0) {
                even[ch - 'a']--;
            }
            else {
                odd[ch - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (even[i] != 0 || odd[i] != 0)
                return false;
        }
        return true;
    }
}