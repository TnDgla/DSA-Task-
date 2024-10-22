package Easy_problems;

import java.util.HashMap;

public class COntMAXfFReq {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        for (int num : nums) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        int totalFrequencies = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency == maxFrequency) {
                totalFrequencies += frequency;
            }
        }

        return totalFrequencies;
    }
}
