```java
class Solution {
    public void sortColors(int[] nums) {
        int[] arr=new int[3];
        int pos=0;
        for(int i:nums) arr[i]++;
        for(int i=0;i<3;i++){
            while(arr[i]>0){
                nums[pos++]=i;
                arr[i]--;
            }
        }
    }
}
```