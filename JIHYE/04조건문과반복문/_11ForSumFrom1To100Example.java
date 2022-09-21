package _04조건문과반복문;

public class _11ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;
        
        // sum을 for문 시작 전에 선언한 이유는 for문이 끝난 후 sum 을 사용하기 위하여
        // 초기화식으로 선언된 변수는 for문 블록 내부에서 사용되는 '로컬 변수'
        // 로컬 변수는 for문을 벗어나서는 사용 불가능
        
        for(int i = 1; i<=100; i++) {			
            sum += i;
        }

        System.out.println("1~100의 합 : " + sum);
        // System.out.println("1~" + i + "의 합 : " + sum); 으로 작성했다면 컴파일 에러 발생
    }
}
