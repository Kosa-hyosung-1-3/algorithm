package w1;
import java.util.*;
public class Week2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int m = Math.min(n1,n2);
		int gcd = 0;
		
		for(int i = 1; i<=m; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println("최대공약수는 " + gcd + "입니다.");
	}

}
