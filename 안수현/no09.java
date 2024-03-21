package w1;
import java.util.*;

public class no09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		
		if(cnt == 2) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		sc.close();
	}

}
