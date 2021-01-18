def dfs(index):
    visited_d[index-1] = True
    print(index, end=' ')
    for x, y in lines:
        if x == index and not visited_d[y-1]:
            dfs(y)


def bfs(index):
    visited_b[index - 1] = True
    queue = [index]
    while queue:
        data = queue.pop(0)
        print(data, end=' ')
        for x, y in lines:
            if x == data and not visited_b[y-1]:
                visited_b[y-1] = True
                queue.append(y)


n, m, v = map(int, input().split())
lines = [list(map(int, input().split())) for i in range(m)]
for a, b in lines[:]:
    lines.append([b, a])
lines.sort()

visited_d = [False] * n
visited_b = [False] * n

dfs(v)
print()
bfs(v)
