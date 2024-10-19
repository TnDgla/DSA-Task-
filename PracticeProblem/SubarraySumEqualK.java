class Solution {
    public int subarraySum(int[] arr, int k) {
        int s=0,i=0,sum=0,c=0;
        if(arr.length==1){
           if(arr[0]==k) return 1;
           if(arr[0]!=k) return 0;
        }
        while(i<arr.length){
            sum+=arr[i];
            while(sum>=k && s<arr.length){
              
                if(sum==k){
                    c++;
                }
                sum-=arr[s];
                s++;
            

            }
            i++;
        }
        return c;
    }
}