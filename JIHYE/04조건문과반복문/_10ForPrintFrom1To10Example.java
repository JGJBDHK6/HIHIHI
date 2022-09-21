package _04조건문과반복문;

public class _10ForPrintFrom1To10Example {
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) {
            System.out.println(i);
        }
        /* 초기화식 생략 가능 (for문 실행 전 초기화식 작성한 경우)
         * ex) int i = 1;
         * 	   for(; i<=100; i++){...}
         */
    }
}
