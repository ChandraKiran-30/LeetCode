class Solution {
    public int rotatedDigits(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            String str = Integer.toString(i);
            char[] s = str.toCharArray();
            boolean valid = true;
            boolean changed = false;
            for (int j = 0; j < s.length; j++) {
                if (s[j] == '3' || s[j] == '4' || s[j] == '7') {
                    valid = false;
                    break;
                }
                else if (s[j] == '2') {
                    s[j] = '5';
                    changed = true;
                }
                else if (s[j] == '5') {
                    s[j] = '2';
                    changed = true;
                }
                else if (s[j] == '6') {
                    s[j] = '9';
                    changed = true;
                }
                else if (s[j] == '9') {
                    s[j] = '6';
                    changed = true;
                }
            }
            if (valid && changed) {
                res++;
            }
        }
        return res;
    }
}