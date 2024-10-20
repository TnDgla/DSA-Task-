import java.util.*;
public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int e : nums){
            map.put(e,map.getOrDefault(e,0)+1);
        }
        int a = nums.length/2;
        for(int key : map.keySet()){
            if(map.get(key)>a) System.out.println(key);
        }
    }
}
