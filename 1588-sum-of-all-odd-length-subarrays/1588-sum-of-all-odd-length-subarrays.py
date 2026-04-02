class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        sum = 0
        n = len(arr)
        for i in range(n):
            for j in range(i, n):
                temp = 0
                for k in range(i, j + 1):
                    temp += arr[k]
                if ((j - i + 1) % 2 != 0):
                    sum += temp
        return sum