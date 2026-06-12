class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int res[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = m - 1; i >= 0; i--) {
            while (!stk.isEmpty() && (stk.peek()) <= nums2[i])
                stk.pop();
            if (stk.isEmpty())
                map.put(nums2[i], -1);
            else
                map.put(nums2[i], stk.peek());
            stk.push(nums2[i]);
        }
        for (int i = 0; i < n; i++)
            res[i] = map.get(nums1[i]);
        return res;
    }
}