class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
            nums[i]=-1;
            else nums[i]=1;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int ans=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum==0){
                ans=Math.max(i+1,ans);
            }
            if(map.containsKey(sum)){
                ans=Math.max(i-map.get(sum),ans);
            }
            else{
                map.put(sum,i);
            }
        }
        return ans;
    }
}