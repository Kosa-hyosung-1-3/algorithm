package w1;
import java.util.*;

public class Week2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("영문 텍스트를 입력하세요 : ");
		String str = sc.nextLine().trim();
		int str_part;
		
		System.out.println("변환된 텍스트를 출력합니다...");
		for(int i = 0; i<str.length(); i++) {
			str_part = (int)str.charAt(i);
			if(str_part >= 65 && str_part <= 90) {
				System.out.print((char)(str_part + 32));
			}else if (str_part >= 97 && str_part <= 122) {
				System.out.print((char)(str_part - 32));
			}
		}

	}
}
