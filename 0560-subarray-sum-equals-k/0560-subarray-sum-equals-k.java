class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer, Integer> map= new HashMap<>();

        int prefixSum=0;
        int count=0;

        map.put(0,1);

        for(int i=0; i< nums.length; i++){

            prefixSum+= nums[i];
            int rem= prefixSum - k;
            if(map.containsKey(rem)){
                count+= map.get(rem);  // adding the number of occurences of subarray sum k
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
            return count;

    }
}