package w1;
import java.util.*;

public class Week2_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int n1 = sc.nextInt();
		int sum = 1;
		
		for(int i = 1; i<=n1; i++) {
			sum *= i;
		}
		System.out.println(sum);
   }
}
