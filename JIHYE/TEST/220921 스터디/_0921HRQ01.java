package Test;

import java.util.Scanner;

public class _0921HRQ01 {
    public static void main(String[] args) {
        int num1 = (int)(Math.random() * 6) + 10;
        //System.out.println(num1);
        Scanner scr = new Scanner(System.in);
        int num2 = scr.nextInt();

        if(num1 == num2){
            System.out.println("일치합니다.");
        } else if(num1 != num2){
            System.out.println("불입치합니다.");
            System.out.println("프로그램 종료");
        }
    }
}
