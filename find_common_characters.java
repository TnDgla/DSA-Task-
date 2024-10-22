import java.util.ArrayList;
import java.util.List;

public class find_common_characters {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>(128);
       for( char ch = 'a' ; ch <='z' ; ch++){
        int minCount = Integer.MAX_VALUE;

        for(String word : words){
            int count = 0;
            for( char c : word.toCharArray()){
                if(c == ch){
                    count++;
                }
            }

            minCount = Math.min(minCount , count);
        }

        for(int i = 0 ; i < minCount ; i++ ){
            list.add(String.valueOf(ch));
        }
       }
        
        return list;
    }

}
