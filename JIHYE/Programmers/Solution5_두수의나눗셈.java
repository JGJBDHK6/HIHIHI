package Programmers;

// 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 solution 함수를 완성해주세요.

class Solution5 {
    public int solution(int num1, int num2) {
        float answer = 0;
        answer = (float) num1 / num2 * 1000;
        return (int)answer;
    }
}

public class Solution5_두수의나눗셈 {
    public static void main(String[] args) {
        Solution5 s1 = new Solution5();
        System.out.println(s1.solution(3,2));
    }
}
