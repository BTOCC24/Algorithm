import sys
N = int(input())
series = [0] * 11

for i in range(N):
    a = int(sys.stdin.readline())
    series[a] = series[a] + 1

for b in range(len(series)):
    if series[b] !=0:
        for c in range(series[b]):
            print(b)

# import sys
# n = int(sys.stdin.readline())
# data = [0] * 100001
# for i in range(n):
#     data[int(sys.stdin.readline())] += 1
#
#




# # 카운트 정렬 사용하기
# import sys
# n = int(sys.stdin.readline())
# data = []
# for i in range(n):
#     data.append(int(sys.stdin.readline()))
#
# min_value = min(data)
# size = max(data) - min(data) + 1
# count = [0] * size
#
# for i in range(n):
#     count[data[i] - min_value] += 1
# for i in range(size - 1):
#     count[i+1] += count[i]
#
# result = [0] * n
# for i in range(n):
#     index = count[data[i] - min_value]
#     result[index - 1] = data[i]
#     count[data[i] - 1] -= 1
# print('\n'.join(map(str, result)))
