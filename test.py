from itertools import permutations

a = [1, 2, 3, 4, 5]

result = list(permutations(a))

# result 안에 모든 요소에 str 작업을 할거야.

# result = [num * 3 for num in a if num % 2 == 0];
result = list(''.join(list(map(str, x)))  for x in result)

print(result)