import java.util.ArrayList;
import java.util.Scanner;
class Student {

    private String name;
    private String no;

    public Student(String name, String no) {
        super();
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNo() {
        return no;
    }
    public void setNo(String no) {
        this.no = no;
    }

}

public class No01 {
    public static void main(String[] args) {

        Student st1 = new Student("손오공", "1682");
        Student st2 = new Student("저팔계", "1772");
        Student st3 = new Student("사오정", "1813");

        ArrayList<Student> list = new ArrayList<Student>();

        list.add(st1);
        list.add(st2);
        list.add(st3);

        for(Student stu : list){
            System.out.println(stu.getName());
            System.out.println(stu.getNo());
        }

        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("계속 검색을 하고 싶으시면 y, 종료하고 싶으면 n");
            String input = scan.next();

            if(input.equals("y")){
                System.out.println("검색을 시작합니다.");
                String name = scan.next();
                boolean flag = false;

                for(Student stu : list){
                    if(stu.getName().equals(name)){
                        System.out.println("해당하는 학생의 학번은 : " + stu.getNo());
                        flag = true;
                    }
                }

                if(!flag){
                    System.out.println("해당하는 학생이름이 없습니다.");
                }

            }else if(input.equals("n")){
                break;
            }
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
