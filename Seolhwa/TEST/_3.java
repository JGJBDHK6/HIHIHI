import java.util.Scanner;
public class _3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        if(i<1000000){
            int a = i*10/100;
            System.out.println("100만원 미만 구매자 입니다. 최종금액은"+(i-a));
        }else {
            int b = i*15/100;
            int n = i/1000000;
            System.out.println("100만원 이상 구매자 입니다. 최종금액은"+(i-b));
            System.out.println("사은품으로"+n+"만원 드리겠습니다");
        }

    }
}
