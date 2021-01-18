n = int(input())
data = []
for _ in range(n):
    data.append(int(input()))

for num in sorted(data):
    print(num)