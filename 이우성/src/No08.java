import java.io.*;

public class No08 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());
        int factorial = 1;
        for(int i = 2; i <= number; i++){
            factorial *= i;
        }

        bw.write(String.valueOf(factorial));
        bw.flush();

        br.close();
        bw.close();

    }

}
