import java.util.HashMap;
import java.util.Map;

public class CountElementsWithMaxFreq {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int fre = 0;
        int max = 1;
        for (int ele : nums){
            if (!map.containsKey(ele)){
                map.put(ele, 1);
            } else{
                int count = map.get(ele);
                count++;
                max = Math.max(max, count);
                map.put(ele, count);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue()==max){
                fre++;
            }
        }
        return max*fre;
    }
}
