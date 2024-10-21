import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int req = target - nums[i];
            int st = i+1, end = n-1;
            while(st<end){
                int sum = nums[st] + nums[end];
                if(sum == req) return target;
                int sumRange = Math.abs(req-sum);
                int minSum = Math.abs(target - min);
                min = sumRange<minSum?sum+nums[i]:min;

                if(sum>req) end--;
                else st++;
            }
        }
        return min;
    }
}
