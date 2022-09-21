package _04조건문과반복문;

public class _05IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 20) + 81;		// 81부터 시작하는 20개의 정수 중 하나(81~100 사이의 값)
        System.out.println("점수: " + score);

        String grade;

        if(score>=90) {
            if(score>=95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else {
            if(score>=85) {
                grade = "B+";
            } else {
                grade = "B";
            }
        }
        System.out.println("학점 : " + grade);
    }
}
