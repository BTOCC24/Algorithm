import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        for (int move : moves){
            for (int row = 0; row < board.length; row++){
                if (board[row][move-1] != 0){ // ³ÖÀ» °ª find
                    if (stack.peek() == board[row][move-1]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(board[row][move-1]);
                    }
                    board[row][move-1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}