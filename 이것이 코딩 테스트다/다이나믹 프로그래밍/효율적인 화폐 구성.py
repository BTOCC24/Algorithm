n, m = map(int, input().split())
coins = [int(input()) for _ in range(n)]

value = [10001] * (m + 1)  # m개 값 저장해서 다이나믹 프로그래밍 진행
value[0] = 0

for coin in coins:
    for x in range(coin, m + 1, coin):
        value[x] = min(value[x-coin] + 1, value[x])

print(value)

