import java.io.*;

public class No09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();

        int result = 0;
        for(int i = 0; i < num.length(); i++){
            result += Integer.parseInt(num.substring(i , i + 1));
        }
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
}
