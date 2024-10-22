```java
class Solution {
    public String largestOddNumber(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            int num = s.charAt(i) + 0;
            if((num & 1) != 0){
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}
```