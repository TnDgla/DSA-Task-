class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int maxLength = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] == 1) ? 1 : -1;

            if (map.containsKey(count)) {
                maxLength = Math.max(maxLength, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLength;
    }
}