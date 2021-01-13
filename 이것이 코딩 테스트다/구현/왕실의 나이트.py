dx = [-2, -1, 1, 2, 2, 1, -1, -2]
dy = [1, 2, 2, 1, -1, -2, -2, -1]
pos = input()

x = ord(pos[0]) - ord('a') + 1
y = int(pos[1])
count = 0

for i in range(8):
    newX = x + dx[i]
    newY = y + dy[i]
    if 0 < newX <= 8 and 0 < newY <= 8:
        count += 1

print(count)