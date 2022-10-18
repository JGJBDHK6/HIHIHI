/*
 *  상품의 가격이 100만원 미만이면 10%할인 적용.
 *  100만원 이상이면 15% 할인 적용 & 사은품을 100만원당 1만원을 주는 프로그램을 작성하여라.
 *  단, 정수로 표현하시오 (소숫점 나오면 안 됨.)
 */

package Test;

import java.util.Scanner;

public class _0921JHA02 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        double price1 = scr.nextInt();

        if(price1 < 1000000){
            double price2 = price1 - (price1 * 0.1);
            int price3 = (int)price2 * 1;
            System.out.println("상품의 가격: "+ price3 + "원");
        } else if(price1 >= 1000000){
            double price2 = price1 - (price1 * 0.15);
            int price3 = (int)price2 * 1;
            double bonus = price1 / 1000000;
            int rebonus = (int)bonus * 1;
            System.out.println("상품의 가격: " + price3 + "원");
            System.out.println("100만원 이상 구매해주시는 고객에 한하여 상품권을 드리고 있습니다~");
            System.out.println("손님께서는 " + rebonus + "만원 상품권을 받을 수 있으시니 1층 카운터에 문의 하시길 바랍니다*^^*");
        }
        System.out.println("조심히 들어가십시오 손님~");

    }
}
