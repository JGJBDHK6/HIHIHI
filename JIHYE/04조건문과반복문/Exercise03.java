package _04조건문과반복문;

public class Exercise03 {
    public static void main(String[] args) {
        int i = 1;
        int sum3 = 0;

        for (; i <= 100; i++){
            if(i % 3 == 0){
                sum3 += i;
            }
        }

        System.out.println("3의 배수의 합: " + sum3);
    }
}
