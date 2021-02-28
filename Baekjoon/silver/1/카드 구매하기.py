n = int(input())
dt = [0] + list(map(int, input().split()))
dp = [0] + [0] * n

for i in range(1, n + 1):
    dp[i] = dt[i]
    for j in range(1, i):
        dp[i] = max(dp[i], dp[j] + dt[i - j])

print(dp[n])

