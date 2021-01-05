def solution(skill, skill_trees):
    answer = 0

    for sk in skill_trees:
        index = []
        for c in skill:
            if (sk.find(c) == -1):
                index.append(30)
            else:
                index.append(sk.find(c))

        if index == sorted(index):
            answer += 1

    return answer

