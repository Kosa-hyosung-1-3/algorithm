package w1;
import java.util.*;

public class Week2_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i<=n1; i++) {
			if(n1 % i == 0) {
				// System.out.println());
				cnt++;
			}
		}
		
		if(cnt == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다");
		}
	}

}
