// 4번 문제 
package w1;
import java.util.*;

public class week2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 10진수를 입력하세요 : ");
		int num = sc.nextInt();
		String num_list = "";
		
		while(true) {
			if(num/2 != 1) {
				num_list += Integer.toString(num%2);
				num /= 2;
			}else {
				num_list += Integer.toString(num%2);
				num_list += '1';
				break;
			}			
		}
		
		System.out.print("\n해당 숫자의 2진수 변환값은 ");
		for(int i = num_list.length()-1; i>=0; i--) {
			System.out.print(num_list.charAt(i));
		}
		// System.out.println(num_list);
		System.out.println("입니다.");
	}
}
