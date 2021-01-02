def solution(s):
    answer = list(s[2:-2].split('},{'))
    answer.sort(key=len)
    result = []
    for item in answer:
        temp = item.split(',')
        result.append(set(map(int, temp)))

    answer = [list(result[0])[0]]
    for i in range(1, len(result)):
        answer.append(list(result[i] - result[i - 1])[0])
    return answer