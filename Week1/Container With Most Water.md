```java
class Solution {
    public int maxArea(int[] height) {
        int st=0;
        int end=height.length-1;
        int area=0;
        while(st<end){
            int len=Math.min(height[st],height[end]);
            int a=len*(end-st);
            if(a>area) area=a;
            if(height[st]>height[end]) end--;
            else st++;
        }
       
        return area;
    }
}
```