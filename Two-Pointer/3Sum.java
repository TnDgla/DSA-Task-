class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashMap<List<Integer>,Integer> map=new HashMap<>();
        List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(nums);
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            start=i+1;
            end=nums.length-1;
            while(start<end){
                if(nums[i]+nums[start]+nums[end]==0){
                    List<Integer> a=new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[start]);
                    a.add(nums[end]);
                    map.put(a,1);
                    start++;
                    end--;
                }else if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }else{
                    start++;
                }
            }
        }

        Set<List<Integer>> sae=map.keySet();

        for(List<Integer> i:sae){
            ans.add(i);
        }

        return ans;

        
    }
}