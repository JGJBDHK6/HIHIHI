// 1) 10부터 15까지의 랜덤 숫자 만들기
// 2) 키보드로 숫자 하나 입력받음
// 3) 입력받은 숫자와 랜덤 숫자가 일치하면 "일치합니다"출력 후 "프로그램 종료" 출력 후 종료
// 4) 불일치하면 "불일치합니다. 출력 후 프로그램 "프로그램 종료" 후 종

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {

        int num = (int)(Math.random() * 6) + 10;
        System.out.println(num);

        System.out.println("10~15 중 입력하세요.");
        System.out.println(">");
        Scanner sc = new Scanner(System.in);
        int scanNum = sc.nextInt();

        if (scanNum == num) {
            System.out.println("일치합니다");
            System.out.println(" ");
            System.out.println("프로그램 종료");
        } else {
            System.out.println("불일치합니다");
        }


// 한 변수에 여러 스캐너 값 못 받는거 해결책 찾기

    }
}
