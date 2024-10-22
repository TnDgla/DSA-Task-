import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {
        // Initialize a frequency array with maximum count from the first word
        int[] charCount = new int[26];
        for (char c : words[0].toCharArray()) {
            charCount[c - 'a']++;
        }

        // Iterate through the rest of the words
        for (int i = 1; i < words.length; i++) {
            int[] currentCount = new int[26];
            for (char c : words[i].toCharArray()) {
                currentCount[c - 'a']++;
            }

            // Update the charCount to be the minimum between charCount and currentCount
            for (int j = 0; j < 26; j++) {
                charCount[j] = Math.min(charCount[j], currentCount[j]);
            }
        }

        // Build the result list based on charCount
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (charCount[i] > 0) {
                result.add(String.valueOf((char) (i + 'a')));
                charCount[i]--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String[] words1 = {"bella", "label", "roller"};
        System.out.println(solution.commonChars(words1)); // Output: ["e", "l", "l"]

        // Test case 2
        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(solution.commonChars(words2)); // Output: ["c", "o"]
    }
}
