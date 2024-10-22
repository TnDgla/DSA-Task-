class Solution:
    def findPeakElement(self, nums: List[int]) -> int:
        x=max(nums)
        for i in range(len(nums)):
            if(x==nums[i]):
                return i