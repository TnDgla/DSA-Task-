import java.util.Arrays;

public class Leet_3005 {
    class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;

        }
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=max)
                break;
            else
                count+=arr[i];
        }
        return count;
        
    }
}
}
