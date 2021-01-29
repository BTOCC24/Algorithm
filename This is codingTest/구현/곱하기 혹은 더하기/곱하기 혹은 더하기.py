data = input()
# 0이나 1일 경우에는 더하는게 맞다.
answer = int(data[0])

for index in range(1, len(data)):
    num = int(data[index])
    if num <= 1 or answer <= 1:
        answer += num
    else:
        answer *= num

print(answer)