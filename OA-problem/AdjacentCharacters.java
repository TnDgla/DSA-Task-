import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacentCharacters {
    public static List<Integer> minSubstitutions(String words[]) {
        List<Integer> result = new ArrayList<>();
        for (String word : words) {
            result.add(countSubstitutions(word));
        }
        return result;
    }

    private static int countSubstitutions(String word) {
        int count = 0;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String [] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        List<Integer> result = minSubstitutions(arr);
        System.out.println(result);  
    }
}
