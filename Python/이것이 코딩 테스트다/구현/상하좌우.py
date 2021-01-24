n = int(input())  # 지도 크기
plans = list(input().split())

dy = [0, 1, 0, -1]
dx = [-1, 0, 1, 0]
moveType = ['U', 'R', 'D', 'L']

x, y = 1, 1

for plan in plans:
    newX = x + dx[moveType.index(plan)]
    newY = y + dy[moveType.index(plan)]

    if 0 < newX <= n and 0 < newY <= n:
        x, y = newX, newY

print(x, y)