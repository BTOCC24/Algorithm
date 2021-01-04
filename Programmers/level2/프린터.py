def solution(priorities, location):
    items = []
    for index, item in enumerate(priorities):
        items.append([index, item])

    val = max(priorities)
    order = 1
    answer = 0

    while items:
        item = items.pop(0)
        if (item[1] == val):
            if (item[0] == location):
                answer = order
                break
            order += 1
            priorities.remove(item[1])
            val = max(priorities)
        else:
            items.append(item)
    return answer