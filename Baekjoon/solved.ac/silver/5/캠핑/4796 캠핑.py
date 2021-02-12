index = 1
while True:
    l, p, v = map(int, input().split())
    if l == p == v == 0:
        break
    result = (v // p) * l + min(l, v % p)
    print("Case " + str(index) + ": " + str(result))
    index += 1

