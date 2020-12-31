n = int(input())

cnt = 0
number = 666
while(True):
    if str(number).find("666") >= 0:
        cnt += 1
    if(cnt == n):
        break
    number += 1

print(number)
