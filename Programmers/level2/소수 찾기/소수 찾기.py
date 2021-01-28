from itertools import permutations


def solution(numbers):
    maxValue = int(''.join(sorted(numbers, reverse=True)))

    # 1 소수를 에라토스테네스의 체로 저장
    prime = [True] * (maxValue + 1)
    prime[0] = prime[1] = False
    for number in range(2, maxValue + 1):
        if number * number > maxValue:
            break
        if prime[number]:
            for index in range(number * 2, maxValue + 1, number):
                prime[index] = False
                # 2 numbers의 수 조합을 저장
    answer = 0
    elementList = list(numbers)  # 각각의 숫자
    numList = list(map(int, elementList))  # 숫자 한개들 저장

    for i in range(2, len(numbers) + 1):
        numList += list(map(int, map(''.join, permutations(elementList, i))))
    numList = list(set(numList))

    # 3 numbers의 각 수마다 소수인지 판별
    for num in numList:
        print(num)
        if prime[num]:
            answer += 1

    return answer