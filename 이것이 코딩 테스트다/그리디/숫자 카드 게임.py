n, m = map(int, input().split())

cards = [min(list(map(int, input().split()))) for i in range(n)]

print(max(cards))
