import sys

def binarySearch(arr, start, end, target):
    if start > end:
        return None

    mid = (start + end) // 2
    if arr[mid] == target:
        return mid
    elif arr[mid] > target:
        return binarySearch(arr, start, mid-1, target)
    else:
        return binarySearch(arr, mid+1, end, target)


n = int(sys.stdin.readline().rstrip())
stored = list(map(int, sys.stdin.readline().rstrip().split()))
m = int(sys.stdin.readline().rstrip())
targets = list(map(int, sys.stdin.readline().rstrip().split()))

stored.sort()

for target in targets:
    result = binarySearch(stored, 0, len(stored)-1, target)
    print(result)