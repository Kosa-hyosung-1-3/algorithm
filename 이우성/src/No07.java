import java.io.*;

public class No07 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        boolean result = true;
        for(int i = 2; i < input; i++){
            if(input % i == 0) {
                result = false;
                break;
            }
        }
        bw.write(String.valueOf(result));
        bw.flush();

        bw.close();
        br.close();
    }
}
