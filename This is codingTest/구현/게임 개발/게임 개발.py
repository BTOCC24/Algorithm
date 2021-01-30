dx = [0, 1, 0, -1]
dy = [-1, 0, 1, 0]

n, m = map(int, input().split())
x, y, direction = map(int, input().split())
map_data = [list(map(int, input().split())) for _ in range(n)]
visited = [[0] * m for _ in range(n)]

count = 1
visited[x][y] = 1
turn = 0  # 턴 횟수

while True:
    print(x, y)
    while turn < 4:
        direction = (direction - 1) % 3
        newX, newY = x + dx[direction], y + dy[direction]
        if map_data[newX][newY] == 0 and visited[newX][newY] == 0:
            x = newX
            y = newY
            visited[x][y] = 1
            turn = 0
            count += 1
            break
        turn += 1

    if turn == 4:
        x -= dx[direction]
        y -= dy[direction]
        if map_data[x][y] == 1:
            break

print(count)
