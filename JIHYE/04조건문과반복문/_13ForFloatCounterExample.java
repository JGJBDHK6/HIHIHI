package _04조건문과반복문;

public class _13ForFloatCounterExample {
    public static void main(String[] args) {
        for(float x = 0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
        /*
         * float 타입은 0.1 정확히 표현 불가
         * x에 더해지는 실제값은 0.1보다 약간 큼
         * 루프는 9번만 실행
         */
    }
}
