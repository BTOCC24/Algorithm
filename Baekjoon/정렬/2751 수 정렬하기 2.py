import sys
n = int(input())
data = []
for _ in range(n):
    data.append(int(sys.stdin.readline()))
data.sort()
print('\n'.join(map(str, data)))