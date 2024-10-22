```java
class Solution {
    public String removeOuterParentheses(String s) {
        int open = 1;
        int close = 0;
        Stack<Character> st = new Stack<>();
        int n = s.length();

        for (int i = 1; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                close++;
            }
            st.push(ch);
            if (open == close) {
                st.pop();
                close = 0;
                open = 1;
                i++;
            }
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }

        return result.toString();
    }
}
```