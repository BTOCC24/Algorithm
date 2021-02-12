n, m = map(int, input().split())
data = list(map(int, input().split()))

while m:
    data.sort()
    hap = data[0] + data[1]
    data[0], data[1] = hap, hap
    m -= 1

print(sum(data))