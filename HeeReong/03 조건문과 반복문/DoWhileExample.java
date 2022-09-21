import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");

        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
        String inputString;

        do {
            System.out.print(">");
            inputString = scanner.nextLine(); // 키보드로 문자 입력받아 문자형 변수 inputString에 저장
            System.out.println(inputString); // 입력받은 문자 변수 출력
        }   while( ! inputString.equals("q")); // ! 변수.equals("ㅋ") = 변수가 ㅋ과 같을 동안(while) do문을 실행

        System.out.println();
        System.out.println("프로그램 종료");
    }
}
