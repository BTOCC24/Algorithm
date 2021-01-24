n, k = map(int, input().split()) # n은 주어진 숫자, k는 나누는 수

result = 0

while n > 1:
    print(n)
    if n % k != 0: # 나머지가 0이 아니면
        result += int(n % k) # 나머지 만큼 더한다
        n = n - (n % k)
    else:
        result += 1
        n /= k

print(result)

