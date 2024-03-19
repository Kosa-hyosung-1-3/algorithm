import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < num; i++){
            System.out.println();
            for(int j = 0; j < num; j++){
                System.out.print(++count + " ");
            }
        }
    }
}
