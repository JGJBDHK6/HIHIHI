package Programmers;

// 첫 번째 분수의 분자와 분모를 뜻하는 denum1, num1, 두 번째 분수의 분자와 분모를 뜻하는 denum2, num2가 매개변수로 주어집니다.
// 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요

import java.util.Arrays;

class Solution7 {

    private int denominator(int denomN1, int denomN2){ // 최대공약수 구하기
        int DNum = 0;

        for (int i = 1; i <= denomN1 && i <= denomN2; i++){
            if ( denomN1 % i == 0 && denomN2 % i == 0 ){
                DNum = i;
            }
        }
        return DNum;
    }

    private int MultipleNum(int mulN1, int mulN2){  // 최소공배수 구하기
        int MNum;
        int DNum;

        DNum = denominator(mulN1, mulN2);

        MNum = mulN1 * mulN2 / DNum;

        return MNum;
    }

    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int momNum; // 분모
        int sonNum = 0; // 분자
        int DNum;

        momNum = MultipleNum(num1, num2); // 분모 구하기 (최소공배수)

        denum1 = denum1 * (momNum / num1);
        denum2 = denum2 * (momNum / num2);

        sonNum = denum1 + denum2;   // 분자

        DNum = denominator(momNum, sonNum); // 분모와 분자의 최대공약수

        if (DNum >= 2){ // 최대공약수가 2 이상이면 약분 가능한 분수이기 때문에 약분
            answer[0] = sonNum / DNum;
            answer[1] = momNum / DNum;
        } else {    // 최대공약수가 2 미만이면 약분 불가능한 분수
            answer[0] = sonNum;
            answer[1] = momNum;
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}

public class Solution7_분수의덧셈 {
    public static void main(String[] args) {
        Solution7 s1 = new Solution7();
        s1.solution(57,256,28,58);
        s1.solution(27,85,59,362);
    }
}
