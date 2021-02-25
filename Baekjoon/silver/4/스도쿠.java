// 14:47

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static final int SIZE = 9;
    static int[][] map = new int[SIZE][SIZE];
    static List<Point> voidPos = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < SIZE; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 0) {
                    voidPos.add(new Point(j, i));
                }
            }
        }
        dfs(0);
        br.close();
    }

    private static void dfs(int index) throws IOException {
        if (voidPos.size() == index) {
            printArr();
            System.exit(0);
        }

        Point pos = voidPos.get(index);
        int x = pos.x, y = pos.y;
        int xz = x / 3 * 3, yz = y / 3 * 3;
        boolean[] xin = new boolean[10], yin = new boolean[10], sin = new boolean[10];
        for (int i = 0; i < SIZE; i++) {
            if (map[i][x] != 0) yin[map[i][x]] = true;
            if (map[y][i] != 0) xin[map[y][i]] = true;
            int t = map[yz + i / 3][xz + i % 3];
            if (t != 0) sin[t] = true;
        }
        for(int i = 1; i<=SIZE; i++){
            if(!xin[i] && !yin[i] && !sin[i]){
                map[y][x] = i;
                dfs(index + 1);
                map[y][x] = 0;
            }
        }
    }

    private static void printArr() throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                bw.write(map[i][j] + " ");
            }
            bw.newLine();
        }
        bw.close();
    }

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}