n, m = map(int, input().split())
data = list(map(int, input().split()))

# 정렬
data.sort()
count = 0

# 세기
for i in range(n - 1):
    for j in range(i, n):
        if data[i] != data[j]:
            count += 1
print(count)