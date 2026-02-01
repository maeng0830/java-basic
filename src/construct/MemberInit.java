package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        // 변수명이 동일할 때는 가까운 스코프의 우선순위를 따른다.
        // this를 통해 인스턴스 자신의 참조값을 가리킬 수 있다.
        // 가까운 지역변수에 동일한 이름을 가진 변수가 없을 경우, this는 생략할 수 있다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
