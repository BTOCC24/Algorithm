n, m = map(int, input().split())
board = []
result = 64
for i in range(n):
    board.append(input())

for i in range(n - 7):
    for j in range(m - 7):
        w, b = 0, 0
        for x in range(i, i + 8):
            for y in range(j, j + 8):
                if (x + y) % 2 == 0:
                    if board[x][y] == 'W':
                        b += 1
                    else:
                        w += 1
                else:
                    if board[x][y] == 'W':
                        w += 1
                    else:
                        b += 1
        result = min(w, b, result)

print(result)
