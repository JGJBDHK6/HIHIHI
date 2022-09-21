package _04조건문과반복문;

public class _19BreakExample {
    public static void main(String[] args) {
        while(true){
            int num = (int)(Math.random() * 6 ) + 1;    // 1부터 시작하는 6개의 정수 중 하나
            System.out.println(num);

            if (num == 6){
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
