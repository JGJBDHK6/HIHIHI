package Programmers;

// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다.
// 예를 들어 1, 2, 7, 10, 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를 완성해보세요.

import java.util.Arrays;

class Solution10{
    int solution(int array[]) {
        int answer = 0;

        Arrays.sort(array);

        int Num1 = array.length / 2;

        answer = array[Num1];

        return answer;
    }
}

public class Solution10_중앙값구하기 {
    public static void main(String[] args) {
        Solution10 s1 = new Solution10();
        int[] array = {1,2,7,10,11};
        int[] array2 = {9,-1,0};
        System.out.println(s1.solution(array));
        System.out.println(s1.solution(array2));


    }
}
