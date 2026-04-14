class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hs = new HashSet<>();
        int n = candyType.length;
        int cnt = 0, i = 0;
        while ((hs.size() < (n / 2)) && (i < n)) {
            hs.add(candyType[i]);
            i++;
        }
        return hs.size();
    }
}