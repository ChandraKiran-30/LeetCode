class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        int temp[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) 
                temp[i][j] = mat[i][j];
        }
        while (k > 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    int tempvar = temp[i][0];
                    for (int j = 0; j < m - 1; j++) {
                        temp[i][j] = temp[i][j + 1];
                    }
                    temp[i][m - 1] = tempvar;
                }
                else {
                    int tempvar = temp[i][m - 1];
                    for (int j = m - 1; j > 0; j--) {
                        temp[i][j] = temp[i][j - 1];
                    }
                    temp[i][0] = tempvar;
                }
            }
            k--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] != mat[i][j])
                    return false;
            }
        }
        return true;
    }
}