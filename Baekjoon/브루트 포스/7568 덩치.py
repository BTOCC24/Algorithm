n = int(input())
humans = []
for i in range(n):
    humans.append(list(map(int, input().split())))

rank = [1] * n

for index in range(len(humans)):
    cnt = 0
    for x in humans:
        if humans[index][0] < x[0] and humans[index][1] < x[1]:
            rank[index] += 1

for r in rank:
    print(r, end=' ')
