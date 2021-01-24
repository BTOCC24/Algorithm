n, m, k = map(int, input().split())
numbers = list(map(int, input().split()))

max_ = max(numbers)
numbers.remove(max_)
max2_ = max(numbers)

a, b = divmod(m, k+1)
result = (max_ * k + max2_) * a + (b * max_)
print(result)