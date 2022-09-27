package HIHIHI_Project.src._06클래스;

public class _08CalculatorExample {
    public static void main(String[] args) {
        _08Calculator mc1 = new _08Calculator();
        mc1.powerOn();

        int result1 = mc1.plus(5,6);
        System.out.println("result1(plus): " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = mc1.divide(x,y);
        System.out.println("result2(divide): " + result2);
    }
}
