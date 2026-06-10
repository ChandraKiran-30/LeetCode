class Solution {
    public boolean isValid(String s) {
        Deque<Character> stk = new ArrayDeque<>();
        char str[] = s.toCharArray();
        for (char x : str) {
            if (x == '{')
                stk.push('}');
            else if (x == '[')
                stk.push(']');
            else if (x == '(')
                stk.push(')');
            else {
                if (stk.isEmpty() || stk.pop() != x)
                    return false;
            }
        }
        return stk.isEmpty();
    }
}