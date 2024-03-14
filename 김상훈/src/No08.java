/*
 팩토리얼 구하기
 반복문
 */

import java.util.Scanner;

public class No08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  //입력 (5)
		int input = Integer.parseInt(sc.next());  //입력한 값
		int factorialNumber = input;  //팩토리얼 결과값 (초기값; 5)
		int firstNumber = 1;  //계속 해서 곱할 값
		while (input != firstNumber) {  //입력한 값 전까지 곱함
			factorialNumber = factorialNumber * firstNumber;  //새 값 = 5*1, 5*1*2, 5*1*2*3, ... 반복
			firstNumber++;
		}
		System.out.println(factorialNumber);
	}
}
