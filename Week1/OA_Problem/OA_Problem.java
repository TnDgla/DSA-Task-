import java.util.*;

public class OA_Problem {
    public static List<Integer> minSubstitutions(List<String> words) {
        List<Integer> result = new ArrayList<>();
        for (String word : words) {
            int substitutions = 0;
            int i = 0;
            while (i < word.length() - 1) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    substitutions++;
                    i += 2;  
                } else {
                    i++;
                }
            }
            result.add(substitutions);
        }
        return result;
    }
    public static void main(String[] args) {
        List<String> inputWords = List.of("add", "boook", "break","ansshhiikkaaa");
        List<Integer> output = minSubstitutions(inputWords);
        System.out.println(output); 
    }
}