package Lv00;
// 짝수의 합
// 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.

public class plus_evenNumber {
    public int solution(int n) {
        int sum=0;
        if(n>0 && n<=1000){
            for(int i=n; i>1; i--){
                if(i%2 == 0)
                    sum += i;
            }
        }return sum;
    }
}
