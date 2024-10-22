class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++)
        {
            int left = i+1;
            int right = nums.length-1;

            while(left<right)
            {
                int currentSum = nums[i] + nums[left] + nums[right];

                if(Math.abs(currentSum - target) < Math.abs(closestSum - target))
                {
                    closestSum = currentSum;
                }
            
            if(currentSum<target)
            {
                left++;
            }

            else if(currentSum>target){
                right--;
            }

            else{
                return currentSum;
            }


            }
        }

        return closestSum;

    }
}