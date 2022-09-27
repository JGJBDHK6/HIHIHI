package HIHIHI_Project.src._06클래스;

public class _13CalculatorExample {
    public static void main(String[] args) {
        _13Calculator C1 = new _13Calculator();

        double result1 = C1.areaRectangle(10);
        double result2 = C1.areaRectangle(10,20);

        System.out.println("정사각형 넓이 = " + result1);
        System.out.println("직사각형 넓이 = " + result2);
    }
}
