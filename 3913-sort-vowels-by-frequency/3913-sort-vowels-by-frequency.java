import java.util.*;

class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = Set.of('a','e','i','o','u');
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> firstIndex = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (vowels.contains(ch)) {
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                firstIndex.putIfAbsent(ch, i);
            }
        }
        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                list.add(ch);
            }
        }
        list.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(b) - freq.get(a);
            }
            return firstIndex.get(a) - firstIndex.get(b);
        });
        char[] res = s.toCharArray();
        int idx = 0;
        for (int i = 0; i < res.length; i++) {
            if (vowels.contains(res[i])) {
                res[i] = list.get(idx++);
            }
        }
        return new String(res);
    }
}