public class contigupousArray {
        public int findMaxLength(int[] nums) {
            //convert all the 0 into -1 and check till the sum becomes 0
            int len =0;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]= -1;
                }else{
                    nums[i]= 1;
                }
            }
    
            Map<Integer,Integer> map = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                sum += nums[i];
                if(sum == 0){
                    len=Math.max(i+1,len);
                }
                if(map.containsKey(sum)){
                    len = Math.max(len,i-map.get(sum));
                }
               else map.put(sum,i);
            }
    
            return len;
        }
    }
    
