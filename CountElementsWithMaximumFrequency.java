public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
    public static int maxFrequencyElements(int[] nums) {
        int[] cnt=new int[101];
        for(int i=0;i<nums.length;i++){
            cnt[nums[i]]++;
        }
        int max=0;
        for(int i=0;i<cnt.length;i++){
            max=Math.max(max,cnt[i]);
        }
        int freq=0;
        for(int num:cnt){
            if(num==max){
                freq+=num;
            }
        }
        return freq;
    }
    
}
