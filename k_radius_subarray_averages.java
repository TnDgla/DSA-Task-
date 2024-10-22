class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int [] arr=new int[n];
        Arrays.fill(arr ,-1);
        int d=2 * k + 1;
        if(k==0){
            return nums;

        }

        if(n < d){
            return arr;

        }

        long [] sumarr =new long[n];
        long sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];
            sumarr[i]=sum;
            
        }
        for(int i=k; i+k<n; i++){
            if(i-k>0){
                arr[i]=(int)((sumarr[i+k]-sumarr[i-k-1])/(2*k+1));
            }else if(i-k==0){
                arr[i]=(int)((sumarr[i+k])/(2*k+1));
            }
            
        }
        return arr;
    }
}
