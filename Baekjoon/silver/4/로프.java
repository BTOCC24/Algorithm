import java.io.*;
import java.util.Arrays;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int rope[] = new int[n];
        int mx = 0;
        for (int i = 0; i < n; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        for (int i = 0; i < n; i++){
            int hap = (n - i) * rope[i];
            if (hap > mx){
                mx = hap;
            }
        }
        bw.write(mx + "\n");
        bw.close();
    }
}