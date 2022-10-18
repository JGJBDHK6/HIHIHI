package HIHIHI_Project.src._06클래스;

public class _09ComputerExample {
    public static void main(String[] args) {
        _09Computer myC1 = new _09Computer();

        int[] values1 = {1,2,3};
        int result1 = myC1.sum1(values1);
        System.out.println("result1: " + result1);

        int result2 = myC1.sum1(new int[] {1,2,3,4,5});
        System.out.println("result2: " + result2);

        int result3 = myC1.sum2(1,2,3);
        System.out.println("result3: " + result3);

        int result4 = myC1.sum2(1,2,3,4,5);
        System.out.println("result4: " + result4);
    }
}

