package _04조건문과반복문;

public class _21ContinueExample {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i % 2 != 0){     // 홀수인 경우 continue => 홀수인 경우 프린트하지 않고 다시 반복문 돌리기
                continue;
            }
            System.out.println(i);
        }
    }
}
