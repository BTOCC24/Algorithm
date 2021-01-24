import sys
n = int(sys.stdin.readline().rstrip())
stored = list(map(int, sys.stdin.readline().rstrip().split()))

x = [0] * 100

x[0], x[1] = stored[0], max(stored[0], stored[1])

for i in range(2, n):
    x[i] = max(x[i-1], x[i-2] + stored[i])

print(x[n-1])

