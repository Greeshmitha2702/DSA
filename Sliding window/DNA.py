#Repeated DNA sequences
#All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". 
#When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
#Write a function to find all the 10-letter-long sequences (substrings) that occur
#eg: "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT" -> ["AAAAACCCCC", "CCCCCAAAAA"]-they both appear twice in the string.
str = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
repeat = set()
seen = set()
k = 10
n = len(str)
for i in range(n - 9):
    seq = str[i:i+10]
    if seq in seen:
        repeat.add(seq)
    else:
        seen.add(seq)
print(list(repeat))
