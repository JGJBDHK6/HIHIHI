package _04조건문과반복문;

public class _07SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int)(Math.random() * 4 ) + 8;		// 8부터 시작하는 4개의 정수 중 하나
        System.out.println("[현재시간: " + time + "시]");

        switch(time) {
            case 8:
                System.out.println("출근합니다.");		// break; 가 없는 이유는 랜덤수 이후 수에 해당하는 문장들도 실행되어야 하기 때문.
            case 9:
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
