package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student 클래스의 객체의 메모리 수조(참조값)을 할당할 수 있는 변수를 선언
        student1 = new Student(); // new 연산자를 통해 Student 클래스의 객체를 메모리에 생성 -> 해당 객체의 메모리 주소(참조값) 반환
        student1.name = "학생1"; // . 을 통해 해당 객체의 멤버에 접근
        student1.age = 17;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 85;

        System.out.println("이름:" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);

        System.out.println(student1); // class1.Student@66a29884 <- 패키지.클래스@참조값
        System.out.println(student2); // class1.Student@4769b07b
    }
}
