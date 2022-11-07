package Programmers;

// 정수 배열 numbers 가 매개변수로 주어집니다. numbers 의 각 원소에 두배한 원소를 가진 배열을 return 하도록 solution 함수를 완성해주세요.

import java.util.Arrays;

class Solution8 {
    public int[] solution(int[] numbers) {

        int[] answer = numbers;

        for(int i = 0; i < numbers.length; i++){
            answer[i] = answer[i] * 2;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

public class Solution8_배열두배만들기 {
    public static void main(String[] args) {
        Solution8 s1 = new Solution8();

        int[] numbers = {1,2,100,-99,1,2,3};

        s1.solution(numbers);

    }
}
