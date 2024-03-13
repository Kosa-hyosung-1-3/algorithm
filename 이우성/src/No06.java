import java.util.Scanner;

public class No06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int smaller = Math.min(num1, num2);

        int gcd = 1;

        for(int i = 2; i <= smaller; i++){
            if(num1 % i == 0 && num2 % i ==0) gcd = i;
        }

        System.out.println(gcd);
    }
}
