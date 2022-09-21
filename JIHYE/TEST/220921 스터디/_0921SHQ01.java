package Test;

import java.util.Scanner;

public class _0921SHQ01 {
    public static void main(String[] args) {
        System.out.print("회원점수는 ");
        int i = (int)(Math.random() * 50 ) + 0;
        char g = 'a';
        if(i < 11){
            g = 'E';
        } else if (i < 21){
            g = 'D';
        } else if (i < 31){
            g = 'C';
        } else if (i < 41){
            g = 'B';
        } else {
            g = 'A';
        }
        System.out.println(g + "등급 입니다.");

        Scanner scr = new Scanner(System.in);
        String z = scr.nextLine();
        //System.out.println(z);

        switch (z) {
            case "A":
            case "B":
                System.out.println("우수회원입니다.");
                break;
            case "C":
            case "D":
                System.out.println("일반회원입니다.");
                break;
            default:
                System.out.println("손님");
                break;
        }
    }

}
