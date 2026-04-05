class Solution {
    public boolean judgeCircle(String moves) {
        int cntx = 0, cnty = 0;
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i);
            if (ch == 'U')
                cnty++;
            else if (ch == 'D')
                cnty--;
            else if (ch == 'R')
                cntx++;
            else
                cntx--;
        }
        return cntx == 0 && cnty == 0;
    }
}