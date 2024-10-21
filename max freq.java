class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int maxfreq=0;
        int freq[]=new int[101];
        for(int num:nums){
            freq[num]++;
            maxfreq=Math.max(maxfreq,freq[num]);
        }
        int sum=0;
        for(int i=0;i<=100;i++){
            if(freq[i]==maxfreq){
                sum+=maxfreq;
            }
        }
        return sum;
    }

}
