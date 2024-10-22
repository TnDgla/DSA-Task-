```java
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        int open = 1;
        int close = 0;

        for(int i=1;i<s.length()-1;i++){
            
            char ch = s.charAt(i);

            if(ch=='('){
                open++;
                st.push(ch);
            }
            else{
                close++;
                st.push(ch);
            }

            if(open==close){
                st.pop();
                close = 0;
                open = 1;
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            
        }
        return sb.reverse().toString();

    }
}
```