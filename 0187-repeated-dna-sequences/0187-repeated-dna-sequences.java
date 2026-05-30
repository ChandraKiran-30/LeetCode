class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        ArrayList<String> res = new ArrayList<>();
        if (s.length() < 10)
            return res;
        HashSet<String> set = new HashSet<>();
        int i = 0, j = 9;
        while (j < s.length()) {
            String str = s.substring(i, j + 1);
            if (set.contains(str) && !res.contains(str))
                res.add(str);
            set.add(str);
            i++;
            j++;
        }
        return res;
    }
}