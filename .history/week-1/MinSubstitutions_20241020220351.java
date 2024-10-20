import java.util.ArrayList;
import java.util.List;

public class MinSubstitutions {
    
    public static List<Integer> minSubstitutions(List<String> words) {
        List<Integer> result = new ArrayList<>();
        
        for (String word : words) {
            int substitutions = 0;
            int i = 0;
            
            // Traverse the word
            while (i < word.length() - 1) {
                // Check if two adjacent characters are the same
                if (word.charAt(i) == word.charAt(i + 1)) {
                    substitutions++;
                    i += 2;  // Skip next character since it's part of the fixed pair
                } else {
                    i++;
                }
            }
            
            result.add(substitutions);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> inputWords = List.of("add", "boook", "break");
        List<Integer> output = minSubstitutions(inputWords);
        
        System.out.println(output);  // Output: [1, 1, 0]
    }
}





