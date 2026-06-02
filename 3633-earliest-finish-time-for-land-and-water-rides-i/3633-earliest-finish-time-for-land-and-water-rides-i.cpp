class Solution {
public:
    int earliestFinishTime(vector<int>& landStartTime, vector<int>& landDuration, vector<int>& waterStartTime, vector<int>& waterDuration) {
        int minFinishTime = INT_MAX;

        int n = landStartTime.size();
        int m = waterStartTime.size();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int start = landStartTime[i];
                int end = start + landDuration[i];

                int sw = max(end, waterStartTime[j]);
                int ew = sw + waterDuration[j];

                minFinishTime = min(minFinishTime, ew);

                int swf = waterStartTime[j];
                int ewf = swf + waterDuration[j];

                int sla = max(ewf, landStartTime[i]);
                int ela = sla + landDuration[i];

                minFinishTime = min(minFinishTime, ela);
            }
        }

        return minFinishTime;
    }
};
