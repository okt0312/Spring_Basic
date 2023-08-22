package hello.core.member;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findeMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find MEmber = " + findMember.getName());
    }
}
