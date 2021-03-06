n, m = map(int, input().split())
visited = [False] * (n + 1)
output = []


def dfs(cur):
    if cur == m:
        print(*output)
    for i in range(1, n + 1):
        if not visited[i]:
            visited[i] = True
            output.append(i)
            dfs(cur + 1)
            visited[i] = False
            output.pop()

dfs(0)