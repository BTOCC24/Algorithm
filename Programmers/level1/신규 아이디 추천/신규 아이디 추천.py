def solution(new_id):
    #1�ܰ�
    new_id = new_id.lower()
    #2�ܰ�
    id = []
    for c in new_id:
        if 'a' <= c <= 'z' or '0' <= c <= '9' or c in ['-', '_', '.']:
            id.append(c)
    #3�ܰ�
    for index in range(len(id)-1):
        if id[index] == '.' and id[index+1] == '.':
            id[index] = ' '
    id = list(filter(lambda x: x != ' ', id))
    #4�ܰ�
    if len(id) > 0 and id[0] == '.':
        id.pop(0)
    if len(id) > 0 and id[-1] == '.':
        id.pop()
    #5�ܰ�
    if len(id) == 0:
        id.append('a')
    #6�ܰ�
    if len(id) >= 15:
        id = id[0:15]
    if len(id) > 0 and id[-1] == '.':
        id.pop()
    #7�ܰ�
    if len(id) == 1:
        id.append(id[0])
        id.append(id[0])
    elif len(id) == 2:
        id.append(id[1])

    id = ''.join(id)
    return id