import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 15: 34
public class Main {
    static int N;
    static int minPrice;
    static int sumDist = 0;
    static long total = 0;
    static int[] dist;
    static int[] price;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        dist = new int[N - 1];
        price = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N - 1; i++) {
            dist[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        minPrice = price[0];
        for (int i = 0; i < N - 1; i++) {
            sumDist += dist[i];
            if (price[i+1] < minPrice){
                total += (long)minPrice * sumDist;
                sumDist = 0;
                minPrice = price[i+1];
            }
        }
        total += (long)minPrice * sumDist;

        System.out.println(total);
    }
}