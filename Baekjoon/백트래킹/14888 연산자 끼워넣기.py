n = int(input())
A = list(map(int, input().split()))
add, sub, mul, div = map(int, input().split())
min_, max_ = 1e9, -1e9

def dfs(index, value, add, sub, mul, div):
    global min_, max_
    if index == n:
        max_ = max(value, max_)
        min_ = min(value, min_)
        return
    else:
        if add:
            dfs(index+1, value+A[index], add-1, sub, mul, div)
        if sub:
            dfs(index+1, value-A[index], add, sub-1, mul, div)
        if mul:
            dfs(index+1, value*A[index], add, sub, mul-1, div)
        if div:
            dfs(index+1, int(value/A[index]), add, sub, mul, div-1)


dfs(1, A[0], add, sub, mul, div)
print(max_)
print(min_)