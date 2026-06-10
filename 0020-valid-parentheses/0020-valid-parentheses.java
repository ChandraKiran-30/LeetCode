class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char str[] = s.toCharArray();
        for (char x : str) {
            if (x == '(' || x == '{' || x == '[') 
                st.push(x);
            else {
                if (!st.isEmpty()) {
                    if ((x == ')') && (st.peek() == '('))
                        st.pop();
                    else if ((x == '}') && (st.peek() == '{'))
                        st.pop();
                    else if ((x ==']') && (st.peek() == '['))
                        st.pop();
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}