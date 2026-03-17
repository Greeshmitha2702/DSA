#Length of Longest substring without repeating characters
s="abcdbcbb"
charSet = set()
n = len(s)
left = 0
maxLen = 0
for right in range(n):
    while(s[right] in charSet):
        charSet.remove(s[left])
        left += 1
    charSet.add(s[right])
    maxLen = max(maxLen, right - left + 1)
print("Length of longest unique substring: ",maxLen)
