def solution(s):
    answer = 10001
    if len(s) == 1:
        return 1
    for cut in range(1, len(s) // 2 + 1):
        result = ""
        token = s[0:cut]
        size = 0
        for index in range(0, len(s) + cut, cut):
            if token == s[index:index+cut]: # 토큰과 동일하다면
                size += 1
            else:
                if size > 1 :
                    result += str(size)
                result += token
                token = s[index:index+cut]
                size = 1
        answer = min(answer, len(result))
    return answer