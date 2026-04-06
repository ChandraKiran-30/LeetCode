class Solution {
    public int pivotInteger(int n) {
       int l = 1, h = n;
       while (l <= h) {
            int mid = (l + h) / 2;
            int lsum = (mid * (mid + 1)) / 2;
            int rsum = ((n * (n + 1)) / 2) - lsum + mid;
            if (lsum == rsum)
                return mid;
            else if (lsum < rsum)
                l = mid + 1;
            else
                h = mid - 1;
       }
       return -1;
    }
}