package Test;

public class _0921HRQ02 {
    public static void main(String[] args) {
        int[] score = {92,87,94};

        //System.out.println(score[0]);
        int sum3 = 0;

        for(int i = 0; i < score.length; i++){
            sum3 += score[i];
        }
        System.out.println("세 사람 점수의 합: " + sum3);

        int avg3 = sum3 / score.length;
        System.out.println("세 사람 점수의 평균: " + avg3);

    }
}
