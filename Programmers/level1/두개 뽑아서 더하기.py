def solution(numbers):
    answer = []
    result = []
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            result.append(numbers[i] + numbers[j])

    answer = sorted(list(set(result)))
    return answer