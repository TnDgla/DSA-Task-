import java.util.*;

public class FindCommonCharacters {
    public List<String> commonChars(String[] words) {

        int n=words.length;
        int count[]=new int [26];
        String firstword=words[0];
        for(char ch:firstword.toCharArray()){
            int index=ch-'a';
            count[index]++;
        }
        for(int i=0;i<n;i++){
            int []curr=new int[26];
            String currword=words[i];
            for(char ch:currword.toCharArray()){
                int index=ch-'a';
                curr[index]++;
            }
            for(int j=0;j<26;j++){
                count[j]=Math.min(count[j],curr[j]);
            }
        }
        List<String> ans=new ArrayList<>();
        for(int j=0;j<26;j++){
            if(count[j]!=0){
                char ch=(char)(j+97);
                int c=count[j];
                while(c>0){
                    ans.add(""+ch);
                    c--;
                }
            }
        }
        return ans;

    }
}
