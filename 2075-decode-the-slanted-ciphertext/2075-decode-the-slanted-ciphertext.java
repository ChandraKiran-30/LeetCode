class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        char text[][] = new char[rows][cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                text[i][j] = encodedText.charAt(idx);
                idx++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int start = 0; start < cols; start++) {
            int i = 0, j = start;
            while (i < rows && j < cols) {
                res.append(text[i][j]);
                i++;
                j++;
            }
        }
        return res.toString().stripTrailing();
    }
}