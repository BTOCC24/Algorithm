N = int(input())
data = [list(map(int, input().split())) for _ in range(N)]

data.sort()
store = []

count = 0  # 들어가 있는 수
min_value = 0  # 들어간 것 중에 제일 작은 일 수
period = data[0][0] - min_value  # 주어진 기한
print(data)

# while data:
while count <= period:
    print(count, period)
    homework = data[0]
    date = homework[0]
    period = date - min_value
    while date == data[count][0]:
        store.append(data.pop(0))
        count += 1


print(store)
