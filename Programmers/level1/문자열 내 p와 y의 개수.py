def solution(s):
    answer = True
    answer = s.count('p') + s.count('P') == s.count('y') + s.count('Y')
    return answer