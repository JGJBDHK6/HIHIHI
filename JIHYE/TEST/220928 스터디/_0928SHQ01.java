package HIHIHI_Project.src.Test;
class score{
    // 필드
    int score;
    char G;

    // 생성자
    public score(){
        this.score = score;
        this.G = G;
    }

    // 메소드
    public char isgrade(){
        int score1 = (int)(Math.random() * 50) + 0;
        System.out.println("회원님의 점수는 "+ score1 +"점입니다!");
        if ( score1 < 11 ){
            G = 'E';
            return G;
        } else if (score1 < 21 ){
            G = 'D';
            return G;
        } else if (score1 < 31 ){
            G = 'C';
            return G;
        } else if (score1 < 41 ){
            G = 'B';
            return G;
        } else if (score1 < 51 ){
            G = 'A';
            return G;
        }
        return G;
    }

    public void getGrade(){
        isgrade();
        System.out.println("그러므로 회원님은 " + G + "등급입니다!");
    }
}

public class _0928SHQ01 {
    public static void main(String[] args) {
        score s1 = new score();
        s1.getGrade();
    }
}
