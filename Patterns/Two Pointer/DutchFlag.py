#Sort the array in increasing order.(use in place array)
#only numbers allowed in the array : [0,1,2]
arr = [2,0,2,1,1,0]
n = len(arr)
l = 0
m = 0
r = len(arr) - 1
while m <= r:
    if arr[m] == 0:
        arr[l],arr[m] = arr[m],arr[l]
        l += 1
        m += 1
    elif arr[m] == 1:
        m += 1
    else:
        arr[m],arr[r] = arr[r],arr[m]
        r -= 1 
print(arr)