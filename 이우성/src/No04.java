import java.util.Scanner;

public class No04 {
    public static void main(String[] args) {
        int input = new Scanner(System.in).nextInt();

        int[] result = new int[100];

        int count = 0;
        while(input != 0){
            result[count++] = input % 2;
            input /= 2;
        }

        for(int i = count - 1; i >= 0; i--){
            System.out.printf("%d", result[i]);
        }
    }
}
