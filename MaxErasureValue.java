public class MaxErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        boolean[] freq = new boolean[10001];
        int max = 0;
        int score = 0;
        while(j<nums.length){
            while(j<nums.length && !freq[nums[j]]){
                score+=nums[j];
                freq[nums[j]] = true;
                j++;
            }
            max = Math.max(score, max);
            while(j<nums.length && freq[nums[j]]){
                score-=nums[i];
                freq[nums[i]] = false;
                i++;
            }
        }
        return max;
    }
}
