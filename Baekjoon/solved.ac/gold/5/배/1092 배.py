N = int(input())
crane = list(map(int, input().split()))
M = int(input())
box = list(map(int, input().split()))

crane.sort(reverse=True)
box.sort(reverse=True)
time = 0

if box[0] > crane[0]:
    time = -1
else:
    while any(box):
        index = 0
        for b_index in range(len(box)):
            if index < N and crane[index] >= box[b_index] != 0:
                index += 1
                box[b_index] = 0
        time += 1

print(time)