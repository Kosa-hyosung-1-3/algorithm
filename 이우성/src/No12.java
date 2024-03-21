import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            for(int j = i; j <= i + n * (n - 1); j += 4){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
