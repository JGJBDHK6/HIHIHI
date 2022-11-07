package Programmers;

// 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 return 하도록 solution 함수를 완성해주세요

class Solution6 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if ( (num1 >= 0 && num1 <=10000) && (num2 >= 0 && num2 <= 10000)){
            if ( num1 == num2 ){
                answer = 1;
            } else if (num1 != num2 ){
                answer = -1;
            }
        }
        return answer;
    }
}

public class Solution6_숫자비교하기 {
    public static void main(String[] args) {
        Solution6 s1 = new Solution6();
        System.out.println(s1.solution(2,3));
    }
}
