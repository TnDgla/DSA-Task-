import java.util.ArrayList;
import java.util.List;
public class Substitution {

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
        List<String> words = new ArrayList<>();
        words.add("add");
        words.add("boook");
        words.add("break");

        List<Integer> output = minSubstitutions(words);
        System.out.println(output);  
    }

}
