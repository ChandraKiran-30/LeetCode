class Solution {
    public int maximumLengthSubstring(String s) {
        int[] cnt = new int[26];
        int l = 0, res = 0;
        for (int r = 0; r < s.length(); r++) {
            int idx = s.charAt(r) - 'a';
            cnt[idx]++;
            while (cnt[idx] > 2) {
                cnt[s.charAt(l) - 'a']--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}