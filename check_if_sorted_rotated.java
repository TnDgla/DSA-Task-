class Solution {
    public boolean check(int[] nums) {
        int cnt=0;
        boolean ans=false;
   for(int i=0;i<=nums.length;i++)
   {  cnt=0;
       for(int j=0;j<=nums.length;j++)
       {
           if(nums[(j+i+1)%nums.length]<=nums[(j+i+2)%nums.length])
            {
                cnt++;
            }
            if(cnt==nums.length)
            {
                ans=true;
            }
            
       }
       
   }
    return ans;
    }
}