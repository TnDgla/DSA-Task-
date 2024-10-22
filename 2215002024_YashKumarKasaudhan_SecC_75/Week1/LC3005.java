class Solution {
    public int maxFrequencyElements(int[] nums) {
        int ar[]=new int[100];
        Arrays.fill(ar,0);
        for(int x:nums) ar[x-1]++;

        int max=0;
        for(int x:ar) max=Math.max(max,x);

        int count=0;
        for(int x:ar)
        {
            if(x==max) count+=x;
        }
        return count;
    }
}