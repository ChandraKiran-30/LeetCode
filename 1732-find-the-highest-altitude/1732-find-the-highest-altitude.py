class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        temp = []
        temp.append(0)
        for i in range(len(gain)):
            temp.append(temp[i] + gain[i])
        return max(temp)