public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=100; i++) { // i는 for문을 벗어나서 쓸 수 없다.(출력문에서 사용 x, 단, for문 전에 선언되었다면 사용 가능)
            sum += i;
        }

        System.out.println("1~100 합: " + sum);
    }
}
