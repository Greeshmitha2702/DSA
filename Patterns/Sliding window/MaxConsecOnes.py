#Max Consecutive Ones
#Find the maximum number of consecutive 1s in the array.
arr = [0,1,1,1,1,0,1,1,1]
cw = 0
ml = 0
for num in arr:
    if num == 1:
        cw += 1
    else:
        cw = 0
    ml = max(ml, cw)
print("Maximum consecutive ones: ",ml)