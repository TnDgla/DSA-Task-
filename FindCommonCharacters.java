import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
    public void makeAns(int[] freq, int[] check){
        for(int i=0; i<26; i++){
            freq[i] = Math.min(freq[i], check[i]);
        }
    }

    public List<String> commonChars(String[] words) {
        int[] freq = new int[26];
        for(char ch : words[0].toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=1; i<words.length; i++){
            int[] check = new int[26];
            for(char ch : words[i].toCharArray()){
                check[ch-'a']++;
            }
            makeAns(freq, check);
        }
        List<String> ans = new ArrayList<>();
        for(int i=0; i<26; i++){
            if(freq[i]>0){
                for(int j=0; j<freq[i]; j++){
                    char ch = (char)(i+'a');
                    ans.add(ch+"");
                }
            }
        }
        return ans;
    }
}
