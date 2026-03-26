class Solution:
    def duplicateNumbersXOR(self, nums: List[int]) -> int:
        nums.sort()
        idx = 0
        xor = 0
        while idx < len(nums):
            if nums.count(nums[idx]) > 1:
                xor ^= nums[idx]
                idx += nums.count(nums[idx])
            else:
                idx += 1
        return xor