package _TEST;

public class _1007HRQ02 extends _1007HRQ01 {
//    double x;
//    double y;

    // ★
    public _1007HRQ02(double x, double y) {
        super(x, y);
    }
    // ☆

    public double numMultiply(){
        double result3 = (x * y) ;
        System.out.println("- 곱셈 : " + result3);
        return result3;
    }

    public double numDivision(){
        double result4 = (x / y) ;
        System.out.println("- 나눗셈 : " + result4);
        return result4;
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
