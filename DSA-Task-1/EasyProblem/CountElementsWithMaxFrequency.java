class Solution {
    public int maxFrequencyElements(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:nums){
           map.put(i,map.getOrDefault(i,0)+1);
       } 
       ArrayList<Integer> arr=new ArrayList<>(map.values());
       int min=0;
       for(int i:arr){
           if(i>min) min=i;
       }
       int count=0;
       for(int i:arr){
           if(min==i) count++;
       }
    
       return min*count;
    }
}