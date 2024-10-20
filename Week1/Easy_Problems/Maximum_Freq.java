class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxfreq = 0;
        int res = 0;
        int freq[] = new int[100];
        for(int i : nums){
            int fre = ++freq[i-1];
            if(fre > maxfreq){
                res = fre;
                maxfreq = fre;
            }
            else if(fre == maxfreq){
                res += fre;
            }
        }
        return res;
    }
}