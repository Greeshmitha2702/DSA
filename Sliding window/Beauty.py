#Sliding Subarray Beauty
#Given an integer array nums and an integer k, the beauty of a subarray is defined as the 
# x-th smallest integer in the subarray where x is equal to the given integer.
#If there are fewer than x elements in the subarray, the beauty is defined as 0.
#Return an integer array containing the beauty of each subarray of size k in the order they appear in nums.
nums = [1, -1, -3, -2, 3]
k = 3
x = 2
n = len(nums)
count = [0] * 101
res = []
for i in range(n):
    if i < k:
        count[nums[i] + 50] += 1
    if i >= k - 1:
        total = 0
        beauty = 0
        for num in range(-50,0):
            total += count[num + 50]
            if total >= x:
                beauty = num
                break
        res.append(beauty)
print(res)
