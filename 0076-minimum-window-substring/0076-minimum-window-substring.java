class Solution {
    public String minWindow(String s, String t) {
        if (t.equals(""))
            return "";
        HashMap<Character, Integer> hmT = new HashMap<>();
        HashMap<Character, Integer> hmS = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hmT.put(ch, hmT.getOrDefault(ch, 0) + 1);
        }
        int have = 0, need = hmT.size();
        int idx1 = -1, idx2 = -1, len = Integer.MAX_VALUE;
        int l = 0, r = 0;
        char str[] = s.toCharArray();
        while (r < str.length) {
            char ch = str[r];
            if (hmT.containsKey(ch)) {
                hmS.put(ch, hmS.getOrDefault(ch, 0) + 1);
                if (hmS.get(ch).equals(hmT.get(ch)))
                    have++;
            }
            while (have == need) {
                if ((r - l + 1) < len) {
                    len = r - l + 1;
                    idx1 = l;
                    idx2 = r;
                }
                char c = str[l];
                if (hmT.containsKey(c)) {
                    hmS.put(c, hmS.get(c) - 1);
                    if (hmS.get(c) < hmT.get(c))
                        have--;
                    if (hmS.get(c) == 0)
                        hmS.remove(c);
                }
                l++;
            }
            r++;
        }
        if (len == Integer.MAX_VALUE)
            return "";
        return s.substring(idx1, idx2 + 1);
    }
}