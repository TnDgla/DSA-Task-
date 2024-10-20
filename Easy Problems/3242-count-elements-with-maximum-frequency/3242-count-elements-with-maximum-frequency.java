class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap();
        for(int i:nums){
            hmap.put(i,hmap.getOrDefault(i,0)+1);
        }

        int maxValue=0;
        int cnt=0;
        for(int i:hmap.values()){
            maxValue=Math.max(maxValue,i);
        }

        for(int i:hmap.values()){
            if(i==maxValue){
                cnt++;
            }
        }
        return cnt*maxValue;
    }
}