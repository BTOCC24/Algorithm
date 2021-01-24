n, m = map(int, input().split())
coins = [int(input()) for _ in range(n)]

count = [10001] * (m + 1)  # m개 값 저장해서 다이나믹 프로그래밍 진행
count[0] = 0

for coin in coins:
    if coin <= m:
        count[coin] = 1

for money in range(1, m + 1):
    for coin in coins:
        if money - coin > 0:
            count[money] = min(count[money], count[money - coin] + 1)

print(count[1:])
