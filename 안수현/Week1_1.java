package w1;
import java.util.*;

public class Week1_1 {

    public static void main(String[] args) {
        ArrayList<Student> s_list = new ArrayList<Student>();
        Student s1 = new Student("홍길동", "123456");
        Student s2 = new Student("유관순", "987654");
        Student s3 = new Student("을지문덕", "657843");
        
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        
        s_list.add(s1);
        s_list.add(s2);
        s_list.add(s3);
        
        for(Student s : s_list) {
            System.out.println("[name : " + s.getName() + "] [Student Number] : " + s.getsNum());
        }
        
        while(true) {
            printMainMenu();
            if(sc.nextLine().equals("y")) {
                System.out.println("검색을 시작합니다. 검색할 학생의 이름과 넘버를 작성하세요.");
                String userSearchName = sc.nextLine();
                String userSearchNum = sc.nextLine();
                
                for(Student s : s_list) {
                    if(s.getName().equals(userSearchName) && s.getsNum().equals(userSearchNum)) {
                        cnt++;
                    }   
                } if(cnt == 1) {
                	System.out.println("해당 학생이 존재합니다.");
                }else {
                	System.out.println("해당 학생이 존재하지 않습니다.");
                }
              sc.nextLine();  
            } else if(sc.nextLine().equals("n")) {
                System.out.println("종료합니다.");
                break;
            }
        }
    }
    
    public static void printMainMenu() {
        System.out.println("\n계속 검색하시겠습니까?");
        System.out.println("================");
        System.out.println("검색을 원하시면 Y / 종료하길 원하시면 N을 누르세요");
    }

}
