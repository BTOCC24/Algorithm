def solution(board, moves):
    answer = 0
    result = []
    while(moves):
        index = moves.pop(0) - 1
        for i in range(len(board)):
            if board[i][index] != 0:
                # 새로 넣을 것이 기존 배열 마지막 요소랑 같다
                if len(result) > 0 and result[-1] == board[i][index]:
                    answer += 2
                    result.pop()
                else:
                    result.append(board[i][index])
                board[i][index] = 0
                break
    return answer