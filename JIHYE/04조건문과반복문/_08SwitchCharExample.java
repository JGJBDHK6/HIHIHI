package _04조건문과반복문;

public class _08SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'A';

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
