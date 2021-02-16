# from itertools import combinations
#
# n, m = map(int, input().split())
# card_list = list(map(int, input().split()))
# big = -1
#
# for cards in combinations(card_list, 3):
#     if sum(cards) <= m:
#         big = max(big, sum(cards))
#
# print(big)

n, m = map(int, input().split())
data = list(map(int, input().split()))
value = -1

for i in range(n-2):
    for j in range(i + 1, n-1):
        for k in range(j + 1, n):
            if value < data[i] + data[j] + data[k] <= m:
                value = data[i] + data[j] + data[k]

print(value)
