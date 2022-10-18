// 이번 시험에서 철수, 영희, 동수는 각각 92, 87, 94점의 점수를 받았다.
// 세 사람의 점수 총합과 평균을 구하고, 출력하세요. (for문 사용)

public class test2 {
    public static void main(String[] args) {
        int[] scores = { 92, 87, 94 };

        int sum = 0;
        for (int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총합 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);

    }
}
