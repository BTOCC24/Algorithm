n, m = map(int, input().split())
iceFrame = [list(map(int, input().split())) for _ in range(n)]
visited = [[False] * m for _ in range(n)]

dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]


def dfs(x, y, f, v):
    if f[x][y] == 1 or v[x][y]:
        return

    v[x][y] = True
    for index in range(4):
        newX = x + dx[index]
        newY = y + dy[index]
        if 0 <= newX < m and 0 <= newY < n:
            dfs(newX, newY, f, v)


# count = 0
# for i in range(n):
#     for j in range(m):
#         if iceFrame[i][j] == 0 and not visited[i][j]:
#             count += 1
#             dfs(i, j, iceFrame, visited)

print(count)