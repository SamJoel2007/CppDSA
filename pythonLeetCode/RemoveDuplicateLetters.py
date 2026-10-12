class Solution:
    def removeDuplicateLetters(self, s: str) -> str:
        lst = list(s)
        myset = sorted(set(lst))
        final = ""
        for x in myset:
            final += x
        return final

s = Solution()

output = s.removeDuplicateLetters("cbacdcbc")
print(output)