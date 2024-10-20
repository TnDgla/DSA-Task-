

public class COuntNiceSubArrays {
    int findSubarrays(int[] nums,int goal){
        int count=0;
        int l=0;
        int r=0;
        int sum=0;
        
        while(r<nums.length){
            sum+=nums[r];

            while(sum>goal){
                sum-=nums[l];
                l+=1;
                
            }
            count+=(r-l+1); // this happens when sum<=goal
            r++;
        }

        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;

            }
            else{
                nums[i]=1;
            }
        }
    

        // findSubarrays() is a function here which finds subarrays having sum<=k
        
        int cnt1=findSubarrays(nums,k);
        int cnt2=findSubarrays(nums,k-1);

        return cnt1-cnt2; 
}
}
