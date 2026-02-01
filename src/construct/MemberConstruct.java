package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 생성자 오버로딩
    MemberConstruct(String name, int age) {
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // this()를 통해 다른 생성자를 호출할 수 있다.
        // this()는 생성자 첫 줄에만 작성할 수 있다.
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        // 생성자는 클래스와 이름이 같아야한다. 따라서 첫 글자도 대문자로 시작한다.
        // 생성자는 반환 타입이 없다.

        System.out.println("생성자 호출 name=" + name + ", age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
