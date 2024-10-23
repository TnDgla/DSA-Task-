import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {

    public static void main(String[] args) {
        String words[] = {"bella","label","roller"};
        List<String> ans=commonChars(words);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static List<String> commonChars(String[] words) {
        int n=words.length;
        List<String> ans=new ArrayList<>();
        int[][] freq=new int[n-1][26];
        for(int i=1;i<n;i++){
            for(char c:words[i].toCharArray()){
                freq[i-1][c-'a']++;
            }
        }
        int j;
        for(char c:words[0].toCharArray()){
            for(j=1;j<n;j++){
                if(freq[j-1][c-'a']>0){
                    freq[j-1][c-'a']--;
                }else{
                    break;
                }
            }
            if(j==n){
                ans.add(c+"");
            }
        }
        return ans;
    }
}