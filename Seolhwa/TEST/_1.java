import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        //1번문제[1] (희령)
       int a =(int)(Math.random()*6)+10;
       System.out.println(a);

       //2)번문제
        Scanner scanner = new Scanner(System.in);
        int hoho = scanner.nextInt();
        System.out.println(hoho);

        //3),4)번문제
        if(a==hoho){
            System.out.println("일치합니다.");
            System.out.println("프로그램 종료.");
        }else {
            System.out.println("불일치합니다.");
            System.out.println("프로그램 종료.");
        }
        //2번문제 [1](희령)
        int c = 92;
        int y = 87;
        int d = 94;

        System.out.println(c+y+d);
        System.out.println((c+y+d)/3);



    }
}
