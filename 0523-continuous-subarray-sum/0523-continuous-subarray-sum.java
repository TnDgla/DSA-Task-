class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            int r=total%k;
            if(map.containsKey(r)){
                if(i-map.get(r)>=2){
                    return true;
                }
            }
            else{
                map.put(r,i);
            }
        }
        return false;
    }
}