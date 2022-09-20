package _04조건문과반복문;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);
        int money = 0;          // 핵심 포인트!!!!! 저장값을 while문 밖에서 선언해야 값도 바뀜.
        
        while(run) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택> ");

            int ch1 = scanner.nextInt();
            
            if (ch1 == 1){
                System.out.print("예금액> ");
                int ch2 = scanner.nextInt();    // 입력받는 수는 입력받을 때 scanner 써주기
                money += ch2;
            } else if (ch1 == 2){
                System.out.print("출금액> ");
                int ch3 = scanner.nextInt();    // 입력받는 수는 입력받을 때 scanner 써주기
                money -= ch3;
            } else if (ch1 == 3){
                System.out.println("잔고> "+ money);
            } else if (ch1 == 4){
                System.out.println();
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
