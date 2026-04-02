class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int pre[] = new int[n];
        int suf[] = new int[n];
        pre[0] = (s.charAt(0) == '0') ? 1 : 0;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '0')
                pre[i] = pre[i - 1] + 1;
            else
                pre[i] =pre[i - 1];
        }
        suf[n - 1] = (s.charAt(n - 1) == '1') ? 1 : 0;
        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '1') 
                suf[i] = suf[i + 1] + 1;
            else
                suf[i] = suf[i + 1];
        }
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, pre[i] + suf[i + 1]);
        }
        return ans;
    }
}