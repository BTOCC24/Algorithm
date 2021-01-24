def calIndex(name, curIndex):
    global answer
    length = len(name)
    i, j = 1, 1

    while name[(curIndex + i) % length] == 'A':
        i += 1
    while name[(curIndex - j) % length] == 'A':
        j += 1
    if i <= j:
        answer += i
        return (curIndex + i) % length
    else:
        answer += j
        return (curIndex - j) % length

def alphaD(ch):
    return min(ord(ch) - ord('A'), ord('A') - ord(ch) + 26)

answer = 0
def solution(name):
    index = 0
    while True:
        global answer
        answer += alphaD(name[index])
        name = name[:index] + 'A' + name[index + 1:]
        if name.count('A') == len(name):
            break
        index = calIndex(name, index)

    return answer