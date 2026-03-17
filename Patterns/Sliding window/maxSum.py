#Maximum Sum Subarray of Size K
arr = [1,9,-1,5,-4,90,6]
k = 4
n = len(arr)
sum = 0
for i in range(k):
    sum += arr[i]
maxSum = sum
for i in range(k, n):
    sum += arr[i]
    sum -= arr[i-k]
    maxSum = max(maxSum, sum)
print("Maximum sum of sub array: ",maxSum)