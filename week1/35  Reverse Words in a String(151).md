```java
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        StringBuilder rev = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            rev.append(words[i]);
            if (i != 0) {
                rev.append(" ");
            }
        }
        return rev.toString();
    }
}

```