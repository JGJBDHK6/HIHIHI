/*
 * 두 수를 입력받은 후 두 수의 최대공약수를 구하시오.
 */

package Test;

import java.util.Scanner;

public class _0921JHA01 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int snum = scr.nextInt();
        int fnum = scr.nextInt();

        System.out.print("두 수의 최대공약수: ");

        int num0 = 0;

        for (int i = 1; (i <= snum) && (i <= fnum); i++){
            if (( snum % i == 0 ) && ( fnum % i == 0)){
                num0 = i;
                if(num0 < i ){
                    num0 = i;
                }
            }
        }
        System.out.println("최대공약수는:" + num0);
    }
}
