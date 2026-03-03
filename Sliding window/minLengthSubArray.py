#Minimum Size Subarray Sum
#Find the minimum length of a contiguous subarray whose sum ≥ target
arr = [1,1,1,1,1,1]
target = 7
n = len(arr)
l = 0
minLength = float('inf')
currentSum = 0
for r in range(n):
    currentSum += arr[r]
    while currentSum >= target:
        minLength = min(minLength, r - l + 1)
        currentSum -= arr[l]
        l += 1
print("minimum size subarray:",0 if minLength == float('inf') else minLength)