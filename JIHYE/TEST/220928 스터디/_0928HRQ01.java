package HIHIHI_Project.src.Test;
class calcultor{
    // 필드
    double num1;
    double num2;
    int result = 0;
    double result2 = 0;

    // 생성자
    public calcultor(){
        this.num1 = 1;
        this.num2 = 1;
    }

    public calcultor(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // 메소드
    void getCalcu(){
        System.out.println("전원을 켭니다.");
        result = (int) num1 + (int) num2;
        System.out.println("덧셈 : " + result);
        result2 = num1 * num2;
        System.out.println("곱셈 : " + result2);
        System.out.println("전원을 끕니다.");
        System.out.println();
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}

public class _0928HRQ01 {
    public static void main(String[] args) {
        calcultor c1 = new calcultor(5, 30);
        c1.getCalcu();

        calcultor c2 = new calcultor();
        c2.getCalcu();
    }
}
