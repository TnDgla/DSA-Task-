public class Solution {
    public int maxArea(int[] arr) {
        int st=0;
        int ed=arr.length-1;
        int ans=0;
        while(st<ed){
            int mh=Math.min(arr[st],arr[ed]);
            int w=ed-st;
            int water=mh*w;
            if(arr[st]<arr[ed]){
                st++;
            }
            else{
                ed--;
            }
            ans=Math.max(ans,water);
        }
        return ans;
        }
    }
 {
    
}
