package Programmers;

// 정수 num1, num2가 매개변수 주어집니다. num1과 num2를 곱한 값을 return 하도록 solution 함수를 완성해주세요.

class Solution3 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((num1 >= 0 && num1 <= 100) || (num2 >= 0 && num2 <= 100))
            answer = num1 * num2;
        return answer;
    }
}

public class Solution3_두수의곱 {
    public static void main(String[] args) {
        Solution3 s1 = new Solution3();
        System.out.println(s1.solution(1,4));
    }
}
