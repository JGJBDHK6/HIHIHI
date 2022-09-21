package Test;

import java.util.Scanner;

public class _0921JHQ01 {
        public static void main(String[] args) {
            Scanner scr = new Scanner(System.in);
            int snum = scr.nextInt();
            int fnum = scr.nextInt();

            System.out.print("두 수의 최대공약수: ");

            int num0 = 0;
            int i = 1;

            while ((i <= snum) && (i <= fnum)){
                if (( snum % i == 0 ) && ( fnum % i == 0)){
                    num0 = i;
                    if(num0 < i ){
                        num0 = i;
                    }
                }
                i++;
            }
            System.out.println(num0);
    }
}
