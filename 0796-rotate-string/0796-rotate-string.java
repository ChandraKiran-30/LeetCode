class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length(), m = goal.length();
        if (n != m)
            return false;
        char str[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            char temp = str[0];
            for (int j = 0; j < n - 1; j++) {
                str[j] = str[j + 1];
            }
            str[n - 1] = temp;
            String res = new String(str);
            if (res.equals(goal))
                return true;
        }
        return false;
    }
}