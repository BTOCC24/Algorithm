# 3:32분시작
n = int(input())  # 맵의 크기
k = int(input())  # 사과의 수
apples = [list(map(int, input().split())) for _ in range(k)]  # 사과 좌표
count = int(input())  # 뱀의 방향 변환 횟수
turns = [list(input().split()) for _ in range(count)]

data = [(1, 1)]  # 차지 좌표
length = 1
direction = 1  # 북쪽부터 시계 0
time = 0  # 소요 시간
dx = [-1, 0, 1, 0]  # x 증가 북쪽부터 시계
dy = [0, 1, 0, -1]  # y 증가
turn = turns[0]

while True:
    time += 1
    head = data[length - 1]
    newX = head[0] + dx[direction]
    newY = head[1] + dy[direction]
    if newX < 1 or newX > n or newY < 1 or newY > n or [newX, newY] in data:
        break

    data.append([newX, newY])
    length += 1

    if [newX, newY] in apples:
        apples.remove([newX, newY])
    else:
        data.pop(0)
        length -= 1

    if time == int(turn[0]):
        if turn[1] == 'D':
            direction = (direction + 1) % 4
        else:
            direction = (direction - 1) % 4
        turns.pop(0)
        if len(turns) > 0:
            turn = turns[0]

print(time)