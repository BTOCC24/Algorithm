import sys
n, m = map(int, sys.stdin.readline().split()) #떡의 갯수와 요청한 길이
data = list(map(int, sys.stdin.readline().split()))

start = 0
end = max(data)

result = 0
while start <= end:
    result = (start + end) // 2
    total = 0
    for d in data:
        if d-result > 0:
            total += (d-result)
    if total > m:
        start = result + 1
    elif total < m:
        end = result - 1
    else:
        break

print(result)



