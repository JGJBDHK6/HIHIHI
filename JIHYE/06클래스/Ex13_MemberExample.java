package HIHIHI_Project.src._06클래스;

public class Ex13_MemberExample {
    public static void main(String[] args) {
        EX13_Member memberService = new EX13_Member();
        boolean result = memberService.login("hong","12345");
        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
