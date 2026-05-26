class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0)
            return "";
        HashMap<Character, Integer> hmT = new HashMap<>();
        HashMap<Character, Integer> hmS = new HashMap<>();
        int idx1 = -1, idx2 = -1, len = Integer.MAX_VALUE;
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            hmT.put(ch, hmT.getOrDefault(ch, 0) + 1);
        }
        int have = 0, need = hmT.size();
        int i = 0, j = 0;
        char str[] = s.toCharArray();
        while (j < str.length) {
            char ch = str[j];
            if (hmT.containsKey(ch)) {
                hmS.put(ch, hmS.getOrDefault(ch, 0) + 1);
                if (hmS.get(ch).equals(hmT.get(ch)))
                    have++;
            }
            while (have == need) {
                if ((j - i + 1) < len) {
                    len = j - i + 1;
                    idx1 = i;
                    idx2 = j;
                }
                char c = str[i];
                if (hmT.containsKey(c)) {
                    hmS.put(c, hmS.get(c) - 1);
                    if (hmS.get(c) < hmT.get(c))
                        have--;
                    if (hmS.get(c) == 0)
                        hmS.remove(c);
                }
                i++;
            }
            j++;
        }
        return (len == Integer.MAX_VALUE) ? "" : s.substring(idx1, idx2 + 1);
    }
}