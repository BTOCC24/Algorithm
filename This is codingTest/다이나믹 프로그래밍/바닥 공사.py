import sys

n = int(sys.stdin.readline().rstrip())

x = [0] * n

x[0] = 1
x[1] = 3

for i in range(2, n):
    x[i] = x[i-1] + x[i-2] * 2

print(x[n-1]%796796)

