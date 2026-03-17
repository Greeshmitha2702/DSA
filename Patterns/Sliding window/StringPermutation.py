#String Permutation using Sliding Window
#Given two strings s1 and s2, return true if s2 contains a 
#permutation of s1, or false otherwise.
#eg: s1 = "abc", s2 = "cbabcabcadef" -> true, because s2 contains "cba", "bac", "abc" which are permutations of s1.
s1 = "abc"
s2 = "cbaccabcadef"
windowSize = len(s1)
s1Count = [0] * 26
s2Count = [0] * 26
for char in s1:
    s1Count[ord(char) - ord('a')] += 1
for i in range(windowSize):
    s2Count[ord(s2[i]) - ord('a')] += 1

if s1Count == s2Count:
    print("Permutation exist: ", s2[:windowSize])

for i in range(windowSize, len(s2)):
    s2Count[ord(s2[i]) - ord('a')] += 1
    s2Count[ord(s2[i - windowSize]) - ord('a')] -= 1
    if s1Count == s2Count:
        print("Permutation exist: ",s2[i - windowSize + 1 : i + 1])