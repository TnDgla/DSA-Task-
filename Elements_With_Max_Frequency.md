``` java

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            int x = nums[i];
            for(int j=i; j<n; j++){
                if(nums[j] == x){
                    arr[i]++;
                }
            }
        }
        int m = 0;
        for(int i : arr){
            m = Math.max(m, i);
        }
        int sum = 0;
        for(int i : arr){
            if(i == m) sum += i;
        }
        return sum;
    }
}
```