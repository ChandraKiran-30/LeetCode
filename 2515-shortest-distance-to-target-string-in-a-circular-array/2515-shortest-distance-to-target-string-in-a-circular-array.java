class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        for (int cnt = 0; cnt < n; cnt++) {
            int right = (startIndex + cnt) % n;
            int left = (startIndex - cnt + n) % n;
            if (words[right].equals(target) || words[left].equals(target)) {
                return cnt;
            }
        }
        return -1;
    }
}