class Solution:
    def check(self, nums) -> bool:
        # 1. finding maximum
        maximum = 0
        minimum = 0
        for i in range(1, len(nums)):
            if nums[maximum] < nums[i]:
                maximum = i
            elif nums[minimum] > nums[i]:
                minimum = i
        # 2. setting minimum according to maximum
        if maximum != len(nums) - 1:
            if nums[minimum] != nums[maximum + 1]:
                return False
            else:
                minimum = maximum + 1
            if nums[len(nums) - 1] > nums[0]:
                return False
        else:
            minimum = 0
        # 3. iterating from 0 to min and min to last
        for i in range(1, minimum):
            if nums[i - 1] > nums[i]:
                return False
        for i in range(minimum + 1, len(nums) - 1):
            if nums[i - 1] > nums[i]:
                return False
        return True

li=[3,4,5,1,2]
sol=Solution()
print(sol.check(li))