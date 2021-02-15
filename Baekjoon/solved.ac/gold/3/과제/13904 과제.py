N = int(input())
data = [list(map(int, input().split())) for _ in range(N)]
data.sort()

score = 0  # 점수
base = 0  # 이전 과제 끝난 시점
deadline = 0  # 과제 기한
buffer = []  # 데이터 쌓일 곳

while data:
    while len(data) > 0 and len(buffer) <= deadline:
        day = data[0][0]
        deadline = day - base
        while len(data) > 0 and data[0][0] == day:
            buffer.append(data.pop(0))

    base = buffer[-1][0]
    buffer.sort(key=lambda x: x[1], reverse=True)

    print(deadline)
    if deadline > len(buffer):
        for i in range(len(buffer)):
            score += buffer[i][1]
    else:
        for i in range(deadline):
            score += buffer[i][1]
    buffer = []

print(score)
