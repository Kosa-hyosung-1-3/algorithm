import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < num; i++){
            if(i != 0) count += num;
            for(int j = 0; j < num; j++){
                if((i + 1) % 2 != 0) System.out.print(++count + " ");
                else System.out.print(count-- + " ");
            }
            System.out.println();
        }
    }
}
