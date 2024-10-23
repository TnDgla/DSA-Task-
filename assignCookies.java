import java.util.Arrays;

public class assignCookies{
    public static void main(String[] args) {
        int [] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(assign(g,s));
    }
    public static int assign(int[] g,int[] s){
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i=0,j=0;
        while(s.length>j && g.length>i){
            if(s[j]>=g[i]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}