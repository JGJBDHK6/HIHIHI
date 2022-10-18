import java.util.Scanner;

public class JihyeTest1 {
    public static void main(String[] args) {
        System.out.println("숫자 두개를 입력하시오.");
        System.out.println(">");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int i = 1;
        int finNum = 0;

        for (; (i <= num1) && (i <= num2); i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {

                if (i == i) {
                    finNum = i;
                }

            }

        }
        System.out.println("두 수의 최대공약수는 " + finNum + "입니다.");
    }
}





