package w1;
import java.util.*;

public class Week1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n_list = new int[10];
		int[] cnt = new int[] {0,0,0,0,0,0,0,0,0,0};
		int max = 0;
		int max_n = 0;
		
		System.out.println("수를 입력하세요");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 수 : ", (i+1));
			int num = Integer.parseInt(sc.nextLine());
			n_list[i] = num;
		}
		
		for(int j = 0; j < 10; j++) {
			cnt[n_list[j]-1]++;
		}

		for(int k = 0; k<10; k++) {
			if(cnt[k] > max){
				 max = cnt[k];
				 max_n = (k+1);
			}
		}
		System.out.printf("\n최빈수는 [%d]이며 빈도 수는 %d이다.", max_n, max);
  }
	
}
