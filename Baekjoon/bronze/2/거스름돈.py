coins = [500, 100, 50, 10, 5, 1]

price = 1000 - int(input())
n = 0
for coin in coins:
    q = price // coin
    n += q
    price -= q * coin

print(n)