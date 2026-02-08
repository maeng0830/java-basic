package pack;

import pack.a.User;


public class PackageMain3 {
    public static void main(String[] args) {
        // 동일한 이름의 클래스가 있는 경우, import는 하나만 할 수 있다.

        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
