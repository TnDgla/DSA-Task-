import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Calculate frequencies
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0; // To track the maximum frequency
        int totalMaxFrequencyCount = 0; // To track the total count of elements with maximum frequency

        // Find the maximum frequency and total count of elements with that frequency
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                totalMaxFrequencyCount = frequency; // Reset count to the new max frequency
            } else if (frequency == maxFrequency) {
                totalMaxFrequencyCount += frequency; // Add to total count
            }
        }
        
        return totalMaxFrequencyCount;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 2, 2, 3, 1, 4};
        System.out.println(solution.maxFrequencyElements(nums1)); // Output: 4

        // Test case 2
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(solution.maxFrequencyElements(nums2)); // Output: 5
    }
}
