```Java
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (temp.length() > 0) {
                    ans.append(reverse(temp)).append(" ");
                    temp.setLength(0); 
                }
            } else {
                temp.append(s.charAt(i));
            }
        }
        if (temp.length() > 0) {
            ans.append(reverse(temp));
        }
        
        return ans.toString().trim(); 
    }
    
    public static String reverse(StringBuilder s) {
        return s.reverse().toString();
    }
}

```