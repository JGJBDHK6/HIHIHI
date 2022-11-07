package Programmers;

// 정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return 하도록 solution 함수를 완성해주세요.

class Solution2 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if ((num1 >= -50000 && num1 <= 50000) && (num2 >= -50000 && num2 <= 50000)){
            answer = num1 - num2;
        }
        return answer;
    }
}

public class Solution2_두수의차 {
    public static void main(String[] args) {
        Solution2 s1 = new Solution2();
        System.out.println(s1.solution(1,4));
    }
}

