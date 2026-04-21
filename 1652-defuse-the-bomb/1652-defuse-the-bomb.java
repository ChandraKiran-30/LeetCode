class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (k == 0)
                res[i] = 0;
            else if (k > 0) {
                int temp = k;
                int sum = 0;
                int j = (i + 1) % n;
                while (temp-- > 0) {
                    sum += code[j];
                    j = (j + 1) % n;
                }
                res[i] = sum;
            }
            else {
                int temp = k;
                int sum = 0;
                int j = (i - 1 + n) % n;
                while (temp++ < 0) {
                    sum += code[j];
                    j = (j - 1 + n) % n;
                }
                res[i] = sum;
            }
        }
        return res;
    }
}