def solution(a, b):
    days = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    name = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    val = 0
    for i in range(a - 1):
        val += days[i]
    val += b
    answer = name[(val+4)%7]
    return answer