/*
[추상클래스]
필드 계좌번호, 이름
메소드
-통장만들기
-정기예금 만들기
 */

package _TEST;

import java.util.Scanner;
public abstract class _1007SHQ01 {
    // field
    String account;
    String name;
    Scanner src = new Scanner(System.in);
    int pay = src.nextInt();

    // Method

    public abstract void customer();
    public abstract void bankbook();
    public abstract void savemoney();

}
