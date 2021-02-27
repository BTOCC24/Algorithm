import sys
n = int(sys.stdin.readline())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]

for index in range(1, len(arr)):
    arr[index][0] += min(arr[index-1][1], arr[index-1][2])
    arr[index][1] += min(arr[index-1][0], arr[index-1][2])
    arr[index][2] += min(arr[index-1][0], arr[index-1][1])

print(min(arr[n-1]))