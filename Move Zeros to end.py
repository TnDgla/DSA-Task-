class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        count = 0
        result = []

        for num in nums:
            if num == 0:
                count += 1
            else:
                result.append(num)

        result.extend([0] * count)

        # Modify nums in-place
        nums[:] = result  # Copy result back to nums
