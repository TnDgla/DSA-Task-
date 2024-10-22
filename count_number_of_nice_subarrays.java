public class count_number_of_nice_subarrays {
        public int numberOfSubarrays(int[] nums, int k) {
            int n=nums.length;
            int []count=new int[n+1];
            count[0]=1;
            int res=0;
            int oc=0;
            for(int num:nums){
                oc+=num&1;
                if(oc-k>=0){
                    res+=count[oc-k];
                }
                count[oc]++;
            }
            return res;
        }
}
