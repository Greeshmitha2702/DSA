#A non decreasing array is given, return a non decreasing array of their sqaures
arr = [-4,-1,0,3,10]
l = 0
r = len(arr) - 1
res = [0] * len(arr)
pos = len(arr) - 1
while l <= r:
    if abs(arr[l]) >= abs(arr[r]):
        res[pos] = arr[l] ** 2
        l += 1
    else:
        res[pos] = arr[r] ** 2
        r -= 1
    pos -= 1
print(res)