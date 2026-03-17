#Given an array and target, return 1-based indices pair whose sum = target. only one such pair exists
numbers = [1, 2, 4, 7, 11, 15]
target = 15
l = 0
r = len(numbers) - 1
while l < r:
    if numbers[l] + numbers[r] == target:
        print([l+1,r+1])
        break
    elif numbers[l] + numbers[r] < target:
        l += 1
    else:
        r -= 1