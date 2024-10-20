class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int [] ans=new int[n];
        Arrays.fill(ans ,-1);
        
        if(k==0){
            return nums;

        }

        if(n < 2*k+1){
            return ans;

        }

        int left=0;
        int right=2*k;
        long sum=0;
        int i=k;
        for(int j=left; j<=right; j++){
            sum=sum+nums[j];
        }
        int avg=(int)(sum/(2*k+1));
        ans[i]=avg;
        i++;
        right++;
        
        while(right<n){
            int leftsidewindow=nums[left];
            int rightsidewindow=nums[right];
            sum=sum-leftsidewindow+rightsidewindow;

            ans[i]=(int)(sum/(2*k+1));
            i++;
            right++;
            left++;
        }
        

        
        return ans;
    }
}