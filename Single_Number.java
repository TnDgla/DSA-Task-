import java.util.*;
public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key)==1) System.out.println(key);
        }
    }
}
