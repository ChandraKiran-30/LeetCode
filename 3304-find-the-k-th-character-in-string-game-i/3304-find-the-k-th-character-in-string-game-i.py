class Solution:
    def kthCharacter(self, k: int) -> str:
        s = "a"
        while len(s) < k:
            t = list(map(str, s.strip()))
            for i in t:
                if i == 'z':
                    s += 'a'
                else:
                    s += chr(ord(i) + 1)
        return s[k - 1]