class Solution {
    public int maxFrequencyElements(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max=0;
        int sum=0;
        for(Integer k:map.values()){
          if(k>max){
            max=k;
            sum=max;
          }
          else if(k==max){
            sum+=k;
            max=k;
          }
        }
        return sum;
    }
}