class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int start = landStartTime[i];
                int end = start + landDuration[i];
                int sw = Math.max(end, waterStartTime[j]);
                int ew = sw + waterDuration[j];
                minTime = Math.min(minTime, ew);
                int swf = waterStartTime[j];
                int ewf = swf + waterDuration[j];
                int sla = Math.max(ewf, landStartTime[i]);
                int ela = sla + landDuration[i];
                minTime = Math.min(minTime, ela);
            }
        }
        return minTime;
    }
}