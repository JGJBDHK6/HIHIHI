package Programmers;

// 정수 num1과 num2가 주어질 때, num1과 num2의 합을 return 하도록 solution 함수를 완성해주세요.

class Solution1 {
    public int solution(int num1, int num2) {
        int answer = -1;
        if ((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000))
            answer = num1 + num2;
        return answer;
    }
}

public class Solution1_두수의합 {
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        System.out.println(s1.solution(10,50));
    }
}
