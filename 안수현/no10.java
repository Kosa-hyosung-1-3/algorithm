package w1;
import java.util.*;
public class no10 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.print("원하는 수를 입력하세요 : ");
      int num = sc.nextInt();
      
      for(int i = 1; i<=num; i++) {
         for(int j = 1; j<=num; j++) {
            System.out.printf("[%d] ", i*j);
         }
         System.out.println("");
      }
   }

}