class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n = boxGrid.length, m = boxGrid[0].length;
        char res[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = boxGrid[n - 1 - j][i];
            }
        }
        for (int j = 0; j < n; j++) {
            int x = m - 1;
            int y = x;
            while (x >= 0 && y >= 0) {
                if (res[x][j] == '.') {
                    x--;
                    continue;
                }
                else if (res[x][j] == '#') {
                    char temp = res[x][j];
                    res[x][j] = res[y][j];
                    res[y][j] = temp;
                    y--;
                }
                else {
                    y = x - 1;
                }
                x--;
            }
        }
        return res;
    }
}