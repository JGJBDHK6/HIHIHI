package _1014JHTEST;
import java.util.Scanner;

public class GamePlayTest {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        int[] Player;
        int[] PlayerScore = new int[3];
        String comNum = "RSP";
        String[] PlayerNum = new String[3];

        while ((PlayerScore[0] < 3) && (PlayerScore[1] < 3) && (PlayerScore[2] < 3) ) {
            System.out.print("Player1 >>> ");
            int Player1 = src.nextInt();
            System.out.print("Player2 >>> ");
            int Player2 = src.nextInt();
            System.out.print("Player3 >>> ");
            int Player3 = src.nextInt();
//            int Player3 = src.nextInt();
            Player = new int[]{Player1, Player2, Player3};

            int com = (int)(Math.random() * 3 ) + 1;

            for (int i = 0; i < Player.length; i++) {
                if (com == 1) {      // 컴퓨터가 가위면
                    if (Player[i] == 1) {   // 플레이어가 가위면 비기기
                        PlayerScore[i] += 0;
                    } else if (Player[i] == 2) {    // 플레이어가 바위면 이기기
                        PlayerScore[i] += 1;
                    } else if (Player[i] == 3) {    // 플레이어가 보자기면 지기
                        PlayerScore[i] -= 0;
                    }

                } else if (com == 2) {      // 컴퓨터가 바위면
                    if (Player[i] == 1) {   // 플레이어가 가위면 지기
                        PlayerScore[i] -= 0;
                    } else if (Player[i] == 2) {    // 플레이어가 바위면 비기기
                        PlayerScore[i] += 0;
                    } else if (Player[i] == 3) {    // 플레이어가 보자기면 이기기
                        PlayerScore[i] += 1;
                    }
                } else if (com == 3) {      // 컴퓨터가 보자기면
                    if (Player[i] == 1) {   // 플레이어가 가위면 이기기
                        PlayerScore[i] += 1;
                    } else if (Player[i] == 2) {    // 플레이어가 바위면 지기
                        PlayerScore[i] -= 0;
                    } else if (Player[i] == 3) {    // 플레이어가 보자기면 비기기
                        PlayerScore[i] += 0;
                    }
                }
            }

            if (com == 1){ comNum = "가위"; }
            else if (com == 2) { comNum = "바위"; }
            else if (com == 3) { comNum = "보"; }
            System.out.println("컴퓨터: " + comNum);

            for(int k = 0; k < Player.length; k ++){
                if (Player[k] == 1){ PlayerNum[k] = "가위"; }
                else if (Player[k] == 2) { PlayerNum[k] = "바위"; }
                else if (Player[k] == 3) { PlayerNum[k] = "보"; }
            }

            System.out.println("P1: " + PlayerNum[0] + " / P1 점수: " + PlayerScore[0]);
            System.out.println("P2: " + PlayerNum[1] + " / P2 점수: " + PlayerScore[1]);
            System.out.println("P3: " + PlayerNum[2] + " / P3 점수: " + PlayerScore[2]);
        }
    }
}
