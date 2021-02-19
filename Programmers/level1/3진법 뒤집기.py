def solution(n):
    result = []
    while (n):
        n, r = divmod(n, 3)
        result.append(r)

    result = int(''.join(map(str, result)), 3)
    return result