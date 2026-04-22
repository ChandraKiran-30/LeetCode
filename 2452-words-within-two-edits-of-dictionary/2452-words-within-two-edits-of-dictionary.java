class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries.length, m = dictionary.length;
        List<String> res = new ArrayList<>();
        for (String q : queries) {
            boolean flag = false;
            for (String d : dictionary) {
                int diff = 0;
                for (int i = 0; i < d.length(); i++) {
                    if (q.charAt(i) != d.charAt(i))
                        diff++;
                    if (diff > 2)
                        break;
                }
                if (diff <= 2) {
                    flag = true;
                    break;
                }
            }
            if (flag)
                res.add(q);
        }
        return res;
    }
}