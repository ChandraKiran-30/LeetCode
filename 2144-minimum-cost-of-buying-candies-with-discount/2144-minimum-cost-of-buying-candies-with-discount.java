class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length, j = n - 1, i = j - 1;
        int totalCost = 0;
        while (i >= 0) {
            totalCost += (cost[i] + cost[j]);
            i -= 3;
            j -= 3;
        }
        if (j >= 0)
            totalCost += cost[j];
        return totalCost;
    }
}