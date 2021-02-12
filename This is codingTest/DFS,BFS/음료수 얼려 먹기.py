n, m = map(int, input().split())
iceFrame = [list(map(int, input())) for _ in range(n)]
dx = [-1, 0, 1, -1]
dy = [0, 1, 0, -1]

def dfs(x, y, f):
    if x < 0 or x >= n or y < 0 or y >= m or f[x][y]:
        return
    f[x][y] = 1
    for index in range(4):
        dfs(x + dx[index], y + dy[index], f)


count = 0
for i in range(n):
    for j in range(m):
        if iceFrame[i][j] == 0:
            count += 1
            dfs(i, j, iceFrame)

print(count)