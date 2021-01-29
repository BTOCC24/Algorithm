n = int(input())
data = list(map(int, input().split()))
data.sort()
avail = []

for coin in data:
    if not avail:
        avail.append(coin)
    else:
        avail += [x + coin for x in avail]

avail = sorted(list(set(avail)))
for i in range(len(avail)):
    if avail[i] != i+1:
        break
print(i + 1)