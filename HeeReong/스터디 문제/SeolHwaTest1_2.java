import java.util.Scanner;

public class SeolHwaTest1_2 {
    public static void main(String[] args) {
        int num = (int)(Math.random()*50);

        if(num>40) {
            System.out.println("회원점수는 A등급 입니다.");
        } else if(num>30) {
            System.out.println("회원점수는 B등급 입니다.");
        } else if(num>20) {
            System.out.println("회원점수는 C등급 입니다.");
        } else if(num>10) {
            System.out.println("회원점수는 D등급 입니다.");
        } else {
            System.out.println("회원점수는 E등급 입니다.");
        }

        //
        Scanner sc = new Scanner(System.in);
        String  scan = sc.nextLine();

        switch(scan) {
            case "A":
                System.out.println("우수 회원입니다.");
                break;

            case "B" :
                System.out.println("우수 회원입니다.");
                break;

            case "C" :
                System.out.println("일반 회원입니다.");
                break;

            case "D" :
                System.out.println("일반 회원입니다.");
                break;

            case "E" :
                System.out.println("손님 입니다.");
                break;
        }
    }
}
