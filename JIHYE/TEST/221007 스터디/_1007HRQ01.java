/* 계산기 만들기
 부모 클래스를 만든다. (전원을 켜는 메소드, 더하기 메소드, 빼기 메소드)
 자식 클래스를 만든다. (곱하기 메소드 , 나누기 메소드, 전원을 끄는 메소드)
 실행 클래스를 만든다. (두 수 x, y를 생성자에 입력해 더하기, 빼기, 곱하기, 나누기_몫 구함)
 모두 double 타입으로 작성

 —  실행 예시
 전원을 켭니다.
 x와 y의 연산결과
 - 덧셈 : …
 - 뺄셈 : …
 - 곱셈 : …
 - 나눗셈 : …
 전원을 끕니다. */

package _TEST;

public class _1007HRQ01 {
    double x;
    double y;

    public _1007HRQ01(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void turnOn(){
        System.out.println("전원을 켭니다.");
        System.out.println(x + "와 " + y + "의 연산결과");
    }

    public double numSum(){
        double result1 = x + y ;
        System.out.println("- 덧셈 : " + result1);
        return result1;
    }

    public double numSubtraction(){
        double result2 = x - y ;
        System.out.println("- 뺄셈 : " + result2);
        return result2;
    }
}
