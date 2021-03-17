import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] data = {"000000","001111","010011","011100","100110","101001","110101","111010"};
        List<Character> list = new ArrayList<>();
        for(int i = 0; i < input.length(); i += 6){
            String str = input.substring(i, i+6);
            int d = 0;
            for(d = 0 ; d < data.length; d++){
                int count = 0;
                int index;
                for(index = 0; index < 6; index++){
                    if(data[d].charAt(index) != str.charAt(index)){
                        count++;
                    }
                    if(count > 2){
                        break;
                    }
                }
                if (count <= 1){
                    list.add((char)('A' + d));
                    break;
                }
            }
            if (d == data.length){
                System.out.println((i + 1) / 6 + 1);
                System.exit(0);
            }
        }
        for(char c : list)
            System.out.print(c);
    }
}