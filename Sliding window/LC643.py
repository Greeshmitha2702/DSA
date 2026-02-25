#Maximum average sub array
arr=[1,12,-5,-6,50,3]
n = len(arr)
sum = 0
k = 4
#First Window sum
for i in range(k):
    sum += arr[i]
#Initialize max sum
maxSum = sum
#Sliding the window
for i in range(k,n):
    sum += arr[i]
    sum -= arr[i-k]
    maxSum = max(maxSum, sum)
print("Maximum average of sub array: ",maxSum/n)