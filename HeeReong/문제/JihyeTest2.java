// 상품의 가격이 100만원 미만이면 10%할인 적용.
//  100만원 이상이면 15% 할인 적용 & 사은품을 100만원당 1만원을 주는 프로그램을 작성하여라.
//  단, 정수로 표현하시오 (소숫점 나오면 안됨.)

import java.util.Scanner;

public class JihyeTest2 {
    public static void main(String[] args) {
        System.out.println("상품의 가격을 입력하시오.");
        Scanner sc = new Scanner(System.in);
        int product = sc.nextInt();
        int prod1 = 1;
        int prod2 = 1;
        int plu = 1;

        if(product<100) {
            prod1 = product - (product * 10/100);
            System.out.println("10% 할인된 가격은" + prod1 + "만원 입니다.");
        } else {
            prod2 = product - (product * 15/100);
            plu = product/100;
            System.out.println("15% 할인된 가격은" + prod2 + "만원 입니다.");
            System.out.println("사은품으로 " + plu + "만원 드립니다.");
        }

    }
}
