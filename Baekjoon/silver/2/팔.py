L, R = map(int, input().split())
mn = 10
for number in range(L, R+1):
    mn = min(mn, str(number).count('8'))
    if mn == 0:
        break
print(mn)