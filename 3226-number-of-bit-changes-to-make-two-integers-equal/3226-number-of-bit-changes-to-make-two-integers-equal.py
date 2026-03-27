class Solution:
    def minChanges(self, n: int, k: int) -> int:
        cnt = 0
        while (n > 0 or k > 0):
            x = n & 1
            y = k & 1
            if (x == 1) and (y == 0):
                cnt += 1
            elif (x == 0) and (y == 1):
                return -1
            n >>= 1
            k >>= 1
        return cnt