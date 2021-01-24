import sys
n = int(sys.stdin.readline().rstrip())

#bottom-up 방식
x = [0] * 30001

for i in range(2, n + 1):
    #1을 빼는 경우
    x[i] = x[i - 1] + 1

    if i % 2 == 0:
        x[i] = min(x[i], x[i // 2] + 1)

    if i % 3 == 0:
        x[i] = min(x[i], x[i // 3] + 1)

    if i % 5 == 0:
        x[i] = min(x[i], x[i // 5] + 1)

print(x[n])