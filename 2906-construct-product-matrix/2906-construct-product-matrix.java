class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int mod = 12345;
        int size = n * m;
        long[] prefix = new long[size];
        long[] suffix = new long[size];
        prefix[0] = grid[0][0] % mod;
        for (int k = 1; k < size; k++) {
            int i = k / m, j = k % m;
            prefix[k] = (prefix[k - 1] * grid[i][j]) % mod;
        }
        suffix[size - 1] = grid[n - 1][m - 1] % mod;
        for (int k = size - 2; k >= 0; k--) {
            int i = k / m, j = k % m;
            suffix[k] = (suffix[k + 1] * grid[i][j]) % mod;
        }
        int[][] res = new int[n][m];
        for (int k = 0; k < size; k++) {
            long left = (k > 0) ? prefix[k - 1] : 1;
            long right = (k < size - 1) ? suffix[k + 1] : 1;
            int i = k / m, j = k % m;
            res[i][j] = (int)((left * right) % mod);
        }
        return res;
    }
}