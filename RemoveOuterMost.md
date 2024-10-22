```Java
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        int open=1;
        int cose=0;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open++;
                st.push(ch);
            }
            else{
                cose++;
                st.push(ch);
            }
            if(open==cose){
                st.pop();
                cose=0;
                open=1;
                i++;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}
```