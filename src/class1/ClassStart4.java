package class1;

public class ClassStart4 {
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

        // Student 객체의 참조값을 2개 저장할 수 있는 배열을 생성한다. 배열의 요소들은 Student 객체의 참조값을 할당할 수 있는 변수이다.
        // Student 객체의 생성 및 참조값 할당이 되지 않았으므로 배열의 요소들은 null이다.
        Student[] students = new Student[2];
        students[0] = student1; // 참조값을 할당한다. <- 자바의 대입은 항상 값을 복사하여 할당. 객체가 복사되는게 아니다.
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);

        System.out.println(student1); // class1.Student@66a29884
        System.out.println(student2); // class1.Student@4769b07b
        System.out.println(students); // [Lclass1.Student;@66a29884
        System.out.println(students[0]); // class1.Student@4769b07b
        System.out.println(students[1]); // class1.Student@cc34f4d
    }
}
