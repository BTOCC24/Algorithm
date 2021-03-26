import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] phoneBook;
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < T ; i++){
            int n = Integer.parseInt(br.readLine());
            phoneBook = new String[n];
            for(int j =0 ; j <n; j++){
                phoneBook[j] = br.readLine();
            }

            Arrays.sort(phoneBook);
            String answer = "YES";
            for(int j = 0 ; j < phoneBook.length - 1; j++){
                if (phoneBook[j + 1].startsWith(phoneBook[j])){
                    answer = "NO";
                    break;
                }
            }

            sb.append(answer + "\n");
        }
        System.out.print(sb.toString());
    }
}