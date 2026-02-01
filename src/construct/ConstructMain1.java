package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 인스턴스 생성 -> 생성자 호출
        MemberConstruct member1 = new MemberConstruct("user1", 10, 50);
        MemberConstruct member2 = new MemberConstruct("user2", 11, 60);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("이름:" + member.name + " 나이:" + member.age + " 성적:" + member.grade);
        }
    }
}
