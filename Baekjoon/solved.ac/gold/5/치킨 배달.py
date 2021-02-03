from itertools import combinations


def calDistance(chickens):
    global data
    dist_sum = 0
    for i in range(len(data)):
        for j in range(len(data[0])):
            if data[i][j] == 1:
                dist = 1e9
                for chicken in chickens:
                    dist = min(dist, abs(i + 1 - chicken[0]) + abs(j + 1 - chicken[1]))
                dist_sum += dist

    return dist_sum


n, m = map(int, input().split())
data = [list(map(int, input().split())) for _ in range(n)]
chicken_store = []

for x in range(len(data)):
    for y in range(len(data[0])):
        if data[x][y] == 2:
            chicken_store.append([x + 1, y + 1])

result = 1e9
for chickens in combinations(chicken_store, m):
    result = min(calDistance(chickens), result)

print(result)
