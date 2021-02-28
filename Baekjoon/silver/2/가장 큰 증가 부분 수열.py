n = int(input())
data = list(map(int, input().split()))

dp = data.copy()

for index in range(1, len(data)):
    for j in range(index - 1, -1, -1):
        if data[index] > data[j]:
            dp[index] = max(dp[index], dp[j] + data[index])

print(max(dp))