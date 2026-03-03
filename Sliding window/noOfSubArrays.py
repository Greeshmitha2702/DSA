#Number of Subarrays having Average Greater or Equal to Threshold
arr = [1,12,-5,-6,50,3]
threshold = 5
k = 3
n = len(arr)
noOfSubArrays = 0
sum = 0
for i in range(k):
    sum += arr[i]
if sum  >= threshold * k: #sum / k >= threshold is written as sum >= threshold * k
    noOfSubArrays += 1
for i in range(k,n):
    sum += arr[i]
    sum -= arr[i-k]
    if sum >= threshold * k:
        noOfSubArrays += 1
print("No of sub arrays having average greater or equal to threshold are: ", noOfSubArrays)