from itertools import combinations

n, m = map(int, input().split())

li = [str(i + 1) for i in range(n)]
data = '\n'.join(list(map(' '.join, list(combinations(li, m)))))

pp = [1,2,3,4]
print(*pp)