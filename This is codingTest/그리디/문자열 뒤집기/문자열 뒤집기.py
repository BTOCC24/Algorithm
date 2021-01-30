s = input()

data = [s[0]]
cur = s[0]

for c in s:
    if c != cur:
        cur = c
        data.append(c)

print(min(data.count('0'), data.count('1')))