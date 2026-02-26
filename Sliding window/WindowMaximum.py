#Sliding Window Maximum - find the maximum in each sliding window of size k
arr = [1,3,-1,-3,5,3,6,7]
k = 3
n = len(arr)
maxList = []
for i in range(n + 1 - k):
    maxVal = arr[i]
    for j in range(i, i + k):
        if arr[j] > maxVal:
            maxVal = arr[j]
    maxList.append(maxVal)

print(maxList)