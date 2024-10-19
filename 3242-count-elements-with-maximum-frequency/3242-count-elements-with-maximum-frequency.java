class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = Collections.max(map.values());
        int total = 0;

        for (int frequency : map.values()) {
            if (frequency == max) {
                total += frequency;
            }
        }

        return total;
    }
}