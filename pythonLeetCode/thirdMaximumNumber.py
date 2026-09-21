class Solution:
    def thirdMax(self, nums: list[int]) -> int:
        n = sorted(nums)
        myset = set(n)
        if len(myset) <= 2:
            return max(myset)
        else:
            for x in range(2):
                m = max(myset)
                myset.remove(m)

            return max(myset)

        