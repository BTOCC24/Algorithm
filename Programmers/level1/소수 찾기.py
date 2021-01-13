def solution(n):
    answer = 0
    number = []
    number.append(2)
    data = [0] * (n + 1)
    for i in range(2, n + 1, 2):
        data[i] = 1

    for i in range(3, n + 1, 2):
        if data[i] == 0:  # 소수 발견
            number.append(i)
            for j in range(i, n + 1, i):
                data[j] = 1
    return len(number)