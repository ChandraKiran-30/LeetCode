class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int cnt0 = 0, cnt1 = 0;
        int i = 0;
        int res = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == '0') cnt0++;
            else cnt1++;
            while (cnt0 > k && cnt1 > k) {
                if (s.charAt(i) == '0') cnt0--;
                else cnt1--;
                i++;
            }
            res += (j - i + 1);
        }
        return res;
    }
}