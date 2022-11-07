package Programmers;

// 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 완성해주세요.

class Solution9 {
    public int solution(int num1, int num2) {
        int answer = -1;
        if  ((num1 > 0 && num1 <= 100) || (num2 > 0 && num2 <= 100)) {
            answer = num1 % num2;
        }
        return answer;
    }
}

public class Solution9_나머지구하기 {
    public static void main(String[] args) {
        Solution9 s1 = new Solution9();

        System.out.println(s1.solution(3,2));
    }
}
