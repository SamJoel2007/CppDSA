class Solution:
    def isPalindrome(self, s: str) -> bool:
        final_string = ""
        s = s.lower()
        for x in s:
            if x.isalpha():
                final_string += x
            else:
                pass

        reversed_string = final_string[::-1]

        if reversed_string == final_string:
            return reversed_string
        else:
            return reversed_string

s = Solution()
print(s.isPalindrome("A man, a plan, a canal: Panama"))  