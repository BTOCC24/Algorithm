 # n, m = map(int, input().split())
#
# num_list = [i + 1 for i in range(n)]
# check_list = [False] * n
#
# arr = []
#
# def dfs(cnt):
#     if(cnt == m):
#         print(' '.join(map(str, arr)))
#         return
#
#     for i in range(0, n):
#         if(check_list[i]):
#             continue
#         check_list[i] = True
#         arr.append(num_list[i])
#         dfs(cnt + 1)
#         arr.pop()
#         check_list[i] = False
#
# dfs(0)

from itertools import permutations

n, m = map(int, input().split())
data = [str(i + 1) for i in range(n)]
data = '\n'.join(list(map(' '.join, permutations(data, m))))
print(data)