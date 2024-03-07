//package w1;
import java.util.*;

/*
    <aside>
💡    피보나치 수열을 구현하는 자바 프로그램을 작성해야 합니다. 피보나치 수열이란, 첫 번째 항과 두 번째 항이 1이며 그 뒤의 모든 항은 바로 앞의 두 항의 합인 수열을 의미합니다.++
   사용자는 'n'을 입력해 'n'번째 피보나치 수까지를 출력하는 프로그램을 작성해야 합니다. 이때, 'n'은 0 이상의 정수만 입력받습니다. 만약 사용자가 0을 입력하면, '0번째 피보나치 수는 정의되지 않습니다.'라는 메시지를 출력하고 프로그램을 종료해야 합니다.

   태그
    **while, flag, ArrayList, foreach**

</aside>
 */
public class Week1_2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc = new Scanner(System.in);
      ArrayList<Integer> numList = new ArrayList<>();
      numList.add(1);
      numList.add(1);
      
      System.out.println("N을 입력하시오 (숫자) ");
      int n = sc.nextInt();
      if(n == 0) { 
         System.out.println("0번째 피보나치 수는 정의되지 않습니다."); 
  
      }else {
      for(int i = 0; i<n-1; i++) {
        if(i == 0) { System.out.printf("[%d] ", numList.get(i));}
         System.out.printf("[%d] ", numList.get(i) + numList.get(i+1));
         numList.add(numList.get(i) + numList.get(i+1));
      }
     }
   }
}
