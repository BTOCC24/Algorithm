def possible(stuff):
    for x, y, a in stuff:
        if a == 0:  # 기둥 조건
            if y == 0 or [x, y - 1, 0] in stuff or [x - 1, y, 1] in stuff or [x, y, 1] in stuff:
                continue
            else:
                return False
        elif a == 1:
            # 보 조건
            if [x, y - 1, 0] in stuff or [x + 1, y - 1, 0] in stuff or [x - 1, y, 1] in stuff and [x + 1, y, 1] in stuff:
                continue
            else:
                return False
    return True

def solution(n, build_frame):
    answer = []

    for x, y, a, b in build_frame:
        if b == 0: # 삭제
            answer.remove([x, y, a])
            if not possible(answer):
                answer.append([x, y, a])
        elif b == 1: # 건설
            answer.append([x, y, a])
            if not possible(answer):
                answer.remove([x, y, a])

    answer.sort()
    return answer