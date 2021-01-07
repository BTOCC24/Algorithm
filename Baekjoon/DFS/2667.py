def dfs(x, y, k):
    if x < 0 or x > N - 1 or y < 0 or y > N - 1 or not data[x][y] or visited[x][y]:
        return
    visited[x][y] = 1
    result[k] += 1
    for d in range(4):
        dfs(x + dx[d], y + dy[d], k)

N = int(input())
data = []

for i in range(N):
    data.append(list(map(int, list(input()))))

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]
cnt = 0
k = 0
result = []

for i in range(N):
    for j in range(N):
        if data[i][j] == 1 and visited[i][j] == 0:
            result.append(0)
            dfs(i, j, k)
            k += 1
            cnt += 1

print(cnt)
for value in sorted(result):
    print(value)