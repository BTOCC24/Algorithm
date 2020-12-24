from itertools import combinations

n, m = map(int, input().split())
card_list = list(map(int, input().split()))
big = -1

for cards in combinations(card_list, 3):
    if sum(cards) <= m:
        big = max(big, sum(cards))

print(big)