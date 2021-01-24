def solution(arr, divisor):
    return sorted(list(filter(lambda x: not(x % divisor), arr))) or [-1]