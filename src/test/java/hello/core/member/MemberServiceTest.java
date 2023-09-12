package hello.core.member;

import hello.core.order.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberServiceTest {

//    MemberService memberService = new MemberServiceImpl();

    ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    MemberService memberService = ac.getBean("memberService", MemberService.class);

    @Test
    void join() {
        // given
        Member member = new Member(1L, "memberA", Grade.VIP);

        // when
        memberService.join(member);
        Member findMember = memberService.findeMember(1L);

        // then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
