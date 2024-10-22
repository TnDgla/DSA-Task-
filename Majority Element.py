class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums = [2,2,1,1,1,2,2]
for i in range(len(nums)):
    if nums.count(nums[i])>len(nums)//2:
        print(nums[i])
