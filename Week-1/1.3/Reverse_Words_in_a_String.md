```java
class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ").trim();
        String[] arr = s.split(" ");
        int srt = 0,e = arr.length - 1;
        while(srt < e){
            String temp = arr[srt];
            arr[srt] = arr[e];
            arr[e] = temp;
            srt++;
            e--;
        }
        String ans = "";
        for(int i=0;i<arr.length;i++){
            if(i<arr.length - 1)
            ans+=arr[i]+" ";
            else{
                ans+=arr[i];
            }
        }
        return ans;
    }
}
```