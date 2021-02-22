class Solution {
    static int numberOfArea;
    static int maxSizeOfOneArea;
    static int rowSize, colSize;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] pic;
    static int[][] visited;

    public int[] solution(int m, int n, int[][] picture) {
        // init
        int[] answer = new int[2];
        numberOfArea = 0;
        maxSizeOfOneArea = 0;
        rowSize = m;
        colSize = n;
        pic = picture;
        visited = new int[rowSize][colSize];

        // 모든 요소 검사
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                if (picture[i][j] != 0 && visited[i][j] == 0){ // 색이 칠해져 있고, 방문한 기록이 없다면
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, dfs(i, j, picture[i][j]));
                }
            }
        }

        // 결과 반환
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    private static int dfs(int i, int j, int color){
        int size = 1;

        visited[i][j] = 1; // 방문 처리
        for(int d = 0; d < 4; d++){
            int nX = i + dx[d];
            int nY = j + dy[d];
            if (nX < 0 || nX >= rowSize || nY < 0 || nY >= colSize)
                continue;
            if (pic[nX][nY] == color && visited[nX][nY] == 0)
                size += dfs(nX, nY, color);
        }
        return size;
    }
}