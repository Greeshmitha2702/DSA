#Subarray Product Less Than K
#Return the number of contiguous subarrays
#where the product of all elements < k
arr = [10,5,2,6,8]
k = 100
count = 0
l = 0
n = len(arr)
product = 1
for r in range(n):
    product *= arr[r]
    while product >= k:
        product //= arr[l]
        l += 1
    count += (r - l + 1)
print("No of such sub arrays: ",count)