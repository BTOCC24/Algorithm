def solution(answers):
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]

    score = [0] * 3
    for i in range(len(answers)):
        if answers[i] == a[i % len(a)]:
            score[0] += 1
        if answers[i] == b[i % len(b)]:
            score[1] += 1
        if answers[i] == c[i % len(c)]:
            score[2] += 1

    answer = []
    val = max(score)

    for i in range(len(score)):
        if val == score[i]:
            answer.append(i + 1)

    return answer