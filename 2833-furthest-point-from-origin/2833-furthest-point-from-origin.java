class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cntR = 0, cntL = 0, n = moves.length();
        char str[] = moves.toCharArray();
        for (int i = 0; i < n; i++) {
            if (str[i] == 'R')
                cntR++;
            else if (str[i] == 'L')
                cntL++;
        }
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (str[i] == 'L')
                idx--;
            else if (str[i] == 'R')
                idx++;
            else {
                if (cntL > cntR)
                    idx--;
                else
                    idx++;
            }
        }
        return Math.abs(idx);
    }
}