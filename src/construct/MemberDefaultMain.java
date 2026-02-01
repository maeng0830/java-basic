package construct;

public class MemberDefaultMain {

    public static void main(String[] args) {
        // 직접 정의한 생성자가 없으면, 자바 컴파일러는 매개변수 및 로직이 없는 기본 생성자를 만들어준다.
        MemberDefault memberDefault = new MemberDefault();
    }
}
