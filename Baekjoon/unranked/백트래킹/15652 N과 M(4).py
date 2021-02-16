n, m = map(int, input().split())
visited = [0] * (n + 1)
result = [0] * m

def dfs(cur):
    if cur == m:
        print(*result)
        return

    for i in range(1, n + 1):
        if not visited[i]:
            result[cur] = i

            for j in range(i):
                visited[j] = True

            dfs(cur + 1)

            for j in range(n + 1):
                visited[j] = False

dfs(0)
