n = int(input())

for i in range(1, n):
    v = i + sum(list(map(int, str(i))))
    if v == n:
        print(i)
        exit(0)

print(0)
