class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int res[][] = new int[n][m];
        Queue<int[]> q = new LinkedList();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j, 0});
                }
            }
        }
        int dx[] = {-1, 1, 0, 0};
        int dy[] = {0, 0, -1, 1};
        while (!q.isEmpty()) {
            int temp[] = q.poll();
            int i = temp[0], j = temp[1], d = temp[2];
            for (int k = 0; k < 4; k++) {
                int x = i + dx[k], y = j + dy[k];
                if (0 <= x && x < n && 0 <= y && y < m && mat[x][y] == 1) {
                    res[x][y] = res[i][j] + 1;
                    mat[x][y] = 0;
                    q.offer(new int[]{x, y, d + 1});
                }
            }
        }
        return res;
    }
}