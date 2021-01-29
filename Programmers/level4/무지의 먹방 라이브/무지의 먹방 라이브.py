def solution(food_times, k):
    if k >= sum(food_times):
        return -1
    size = len(food_times)
    li = list(enumerate(food_times))

    while k >= size and len(li) > 1:
        # 몫 구하기
        q, k = divmod(k, size)
        # 몫 만큼 빼기
        li = [(index, time - q) for index, time in li]
        # 음수 오버난거
        k -= sum(x[1] for x in li if x[1] < 0)
        # 아직 음식남은거
        li = list(filter(lambda x: x[1] > 0, li))
        # size 재조정
        size = len(li)
    # 반환
    if len(li) == 1:
        return li[0][0] + 1
    return li[k][0] + 1