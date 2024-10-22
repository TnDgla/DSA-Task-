import java.util.ArrayList;
import java.util.List;

public class CommonChar {
    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();
        
        int[] minFreq = new int[26];
        
        for (char c : words[0].toCharArray()) {
            minFreq[c - 'a']++;
        }
        
        for (int i = 1; i < words.length; i++) {
            int[] freq = new int[26];
            for (char c : words[i].toCharArray()) {
                freq[c - 'a']++;
            }
            
            for (int j = 0; j < 26; j++) {
                minFreq[j] = Math.min(minFreq[j], freq[j]);
            }
        }
        
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0) {
                result.add(Character.toString((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String[] words1 = {"bella", "label", "roller"};
        System.out.println(commonChars(words1)); 
        String[] words2 = {"cool", "lock", "cook"};
        System.out.println(commonChars(words2)); 
    }
}
