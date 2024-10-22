```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String ans=s+s;
        
        return ans.contains(goal);
    }
}

```