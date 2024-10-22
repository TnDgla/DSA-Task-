```java
class Solution {
    public String removeOuterParentheses(String s) {
       Stack<Character> st=new Stack<>();
        int open=1;
        int close=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(') {
                st.push(ch);
                open++;
            }else {
                st.push(ch);
                close++;
            }
            if(open==close){
                st.pop();
                i++;
                open=1;
                close=0;
            }
        }
        String result = stackToString(st);
            return result;
    }
    public static String stackToString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();

        // Pop elements from the stack and append to the string builder
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        // Reverse the string builder to maintain original order
        return sb.reverse().toString();
    }
}
```