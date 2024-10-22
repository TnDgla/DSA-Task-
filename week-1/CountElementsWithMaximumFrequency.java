import java.util.HashMap;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args){
        int[] nums={1,2,2,1,3,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        int max=Integer.MIN_VALUE;
        int cnt=0;
        for(int i:map.values()){
            max=Math.max(i, max);
        }
        for(int i:map.values()){
            if(i==max){
                cnt++;
            }
        }
        System.err.println(cnt*max);
    }
}
