import java.util.HashMap;
import java.util.Map;

public class maxFrequency {
    
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int maxFre = Integer.MIN_VALUE;
        int res = 0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            maxFre = Math.max(maxFre,entry.getValue());
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()==maxFre){
                res += entry.getValue();
            }
        }

        return res;


    }
}
