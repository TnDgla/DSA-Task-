import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet_1002 {
    public List<String> commonChars(String[] words) {
        int Comm[]=new int[26];
        Arrays.fill(Comm,101);      //Since maximum value possible is 100

        for(int i=0;i<words.length;i++){
            int freq[]=new int[26];  // to count freq of chars in each String
            for(int j=0;j<words[i].length();j++){
                int x=words[i].charAt(j)-'a';
                freq[x]++;
            }
            //Updating frequency of chars in the common array

            for(int k=0;k<26;k++){
                Comm[k]=Math.min(Comm[k],freq[k]);
            }
        }

        List<String> ans=new ArrayList<>();

        for(int i=0;i<Comm.length;i++){
            while(Comm[i]-->0){
                ans.add(String.valueOf((char)('a'+i)));
            }
        }

        return ans;
    }
}
