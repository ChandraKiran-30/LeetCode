class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat.length, m = mat[0].length;
        if ((n * m) != (r * c))
            return mat;
        int res[][] = new int[r][c];
        int x = 0, y = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (y == m) {
                    y = 0;
                    x++;
                }
                res[i][j] = mat[x][y++];
            }
        }
        return res;
    }
}