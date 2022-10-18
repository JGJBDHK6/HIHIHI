package _1014JHTEST;

import java.util.Scanner;

public class KindOfGame extends initialSettings {

    String p1 = "지혜";
    String p2 = "희령";
    String p3 = "설화";
    String[] PlayerName = { p1, p2, p3 };

    // 초기 점수 세팅
//    int p1Score = 0;
//    int p2Score = 0;
//    int p3Score = 0;

    int[] PlayerScore = new int[3];
    Scanner src = new Scanner(System.in);

    public void StartDetail(){
        System.out.println();
        System.out.println("====================== GAME START ======================");
        System.out.println("Player를 소개합니다~");
        System.out.println("첫번째 참가자!!! "+ "\t" + p1 );
        System.out.println("두번째 참가자!!! "+ "\t" + p2 );
        System.out.println("세번째 참가자!!! "+ "\t" + p3 );
        System.out.println();
    }

    public void RSPGameDetail() {
        // 1 : 가위, 2 : 바위, 3 : 보

        int[] Player;
        String comNum = "RSP";
        String[] PlayerRSP = new String[3];

        System.out.println("====================== FIRST GAME! ======================");
        System.out.println("세계 모두가 아는 그 게임! 가위바위보입니다!");
        System.out.println("플레이어 중 한명이라도 3점 득점 시 다음 게임이 진행됩니다!");
        System.out.println("플레이어들은 순서대로 가위바위보를 지정하여주세요");
        System.out.println("입력 방식: 가위 - 1 / 바위 - 2 / 보 - 3 ");

        while ((PlayerScore[0] < 3) && (PlayerScore[1] < 3) && (PlayerScore[2] < 3) ) {
            System.out.println("=========================================================");
            System.out.print(p1 + " >>> ");
            int Player1 = src.nextInt();
            System.out.print(p2 +" >>> ");
            int Player2 = src.nextInt();
            System.out.print(p3 + " >>> ");
            int Player3 = src.nextInt();
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
                if (Player[k] == 1){ PlayerRSP[k] = "가위"; }
                else if (Player[k] == 2) { PlayerRSP[k] = "바위"; }
                else if (Player[k] == 3) { PlayerRSP[k] = "보"; }
            }

            System.out.println( p1 + ": " + PlayerRSP[0] + "\t\t / " + p1 + " 점수: " + PlayerScore[0]);
            System.out.println( p2 + ": " + PlayerRSP[1] + "\t\t / " + p2 + " 점수: " + PlayerScore[1]);
            System.out.println( p3 + ": " + PlayerRSP[2] + "\t\t / " + p3 + " 점수: " + PlayerScore[2]);
            System.out.println();
        }
    }

    public void OOEGameDetail(){

        int[] Player;
        String[] PlayerOOE = new String[3];

        System.out.println("====================== SECOND GAME! ======================");
        System.out.println("바로바로~! 홀짝 게임입니다!");
        System.out.println("컴퓨터가 1 ~ 20 사이의 랜덤 수를 갖고 있을 예정입니다!");
        System.out.println("플레이어들은 이를 예상하여 홀짝 중 하나를 선택하고, 정답일 시 득점입니다~");
        System.out.println("첫번째 게임과 마찬가지로 홀짝 게임에서 3점을 득점한 플레이어가 발생하면 다음 게임으로 넘어갑니다!");
        System.out.println("플레이어들은 순서대로 홀짝 중 하나를 지정하여주세요");
        System.out.println("입력 방식: 홀 - 1 / 짝 - 2 ");

        while ((PlayerScore[0] < 6) && (PlayerScore[1] < 6) && (PlayerScore[2] < 6) ) {
            System.out.println("=========================================================");
            System.out.print(p1 + " >>> ");
            int Player1 = src.nextInt();
            System.out.print(p2 + " >>> ");
            int Player2 = src.nextInt();
            System.out.print(p3 + " >>> ");
            int Player3 = src.nextInt();

            Player = new int[]{Player1, Player2, Player3};

            int com = (int) (Math.random() * 20) + 1;

            for (int i = 0; i < Player.length; i++) {
                if (com % 2 == 0) {      // 컴퓨터가 짝수면
                    if (Player[i] == 1) {   // 플레이어가 홀수 지정시 득점 X
                        PlayerScore[i] += 0;
                    } else if (Player[i] == 2) {    // 플레이어가 짝수 지정시 1점 득점!
                        PlayerScore[i] += 1;
                    }
                } else if (com % 2 != 0) {      // 컴퓨터가 홀수면
                    if (Player[i] == 1) {   // 플레이어가 홀수 지정시 1점 득점!
                        PlayerScore[i] += 1;
                    } else if (Player[i] == 2) {    // 플레이어가 짝수 지정시 득점 X
                        PlayerScore[i] += 0;
                    }
                }
            }
            
            System.out.println("컴퓨터가 뽑은 수: " + com);

            for(int k = 0; k < Player.length; k ++){
                if (Player[k] == 1){ PlayerOOE[k] = "홀"; }
                else if (Player[k] == 2) { PlayerOOE[k] = "짝"; }
            }

            System.out.println( p1 + ": " + PlayerOOE[0] + "\t\t / " + p1 + " 점수: " + PlayerScore[0]);
            System.out.println( p2 + ": " + PlayerOOE[1] + "\t\t / " + p2 + " 점수: " + PlayerScore[1]);
            System.out.println( p3 + ": " + PlayerOOE[2] + "\t\t / " + p3 + " 점수: " + PlayerScore[2]);
        }
    }


    public void DiceRunDetail(){
        System.out.println("====================== FINAL GAME! ======================");
        System.out.println("점수가 낮아서 실망하시고 계신가요!? 그런 플레이어를 위한 게임! 바로바로~! 주사위 던지기 게임입니다!");
        System.out.println("룰을 설명드리겠습니다!");
        System.out.println("플레이어들은 주사위를 1개를 굴릴지, 2개를 굴릴지 선택할 수 있습니다.");
        System.out.println("하나의 주사위는 특별한 주사위! 주사위의 눈이 4 ~ 9 사이의 숫자로 만들어져 나온 수를 득점할 수 있습니다!");
        System.out.println("이 경우 최소 4점, 최대 9점을 득점할 수 있겠죠~!?");
        System.out.println("두개를 굴리게 되면 주사위 두 주사위 눈의 합을 득점할 수 있습니다!");
        System.out.println("주사위 두개를 굴릴시에는 최소 2점, 최대 12점을 득점할 수 있겠죠~?!");
        System.out.println("안전하게 점수를 득점할지, 더 많은 점수를 얻기 위하여 모험을 할 것인지 플레이어들의 선택입니다!");
        System.out.println("자! 그럼 플레이어들은 순서대로 굴릴 주사위의 수를 지정하여 주세요!");
        System.out.println("입력 방식: 주사위 갯수 - 1 / 2 ");

        int[] Player;
        int[] DiceScore = new int[3];

        while(true) {
            System.out.println("=========================================================");
            System.out.print(p1 + " >>> ");
            int Player1 = src.nextInt();
            System.out.print(p2 + " >>> ");
            int Player2 = src.nextInt();
            System.out.print(p3 + " >>> ");
            int Player3 = src.nextInt();

            Player = new int[]{Player1, Player2, Player3};

            for (int i = 0; i < Player.length; i++){
                if (Player[i] == 1 ){
                    int Dice1Num = (int)(Math.random() * 6 ) + 4;

                    DiceScore[i] += Dice1Num;

                    PlayerScore[i] += Dice1Num;

                } else if (Player[i] == 2) {
                    int Dice2Num_1 = (int)(Math.random() * 6 ) + 1;
                    int Dice2Num_2 = (int)(Math.random() * 6 ) + 1;

                    int Dice2Score = Dice2Num_1 + Dice2Num_2;
                    DiceScore[i] = Dice2Score;

                    PlayerScore[i] += Dice2Score;
                }
            }
            System.out.println( p1 + "의 선택: 주사위 " + Player[0] + "개! " + p1 + " 득점 점수: " + DiceScore[0] );
            System.out.println( p2 + "의 선택: 주사위 " + Player[1] + "개! " + p2 + " 득점 점수: " + DiceScore[1] );
            System.out.println( p3 + "의 선택: 주사위 " + Player[2] + "개! " + p3 + " 득점 점수: " + DiceScore[2] );
            break;
        }
    }

    String Winner;
    public void finishGameDetail(){


        int WinnerScore = 0;

        for (int i = 0; i < PlayerName.length; i++){
            if (WinnerScore < PlayerScore[i]){
                WinnerScore = PlayerScore[i];
                Winner = PlayerName[i];
            }
        }

        System.out.println();
        System.out.println("====================== GAME FINISH! ======================");
        System.out.println("자! 게임을 모두 진행하였습니다~! 즐거우셨나요!?");
        System.out.println("이제부터는 점수 계산 및 순위 발표가 있겠습니다!");
        System.out.println("먼저 최종 점수를 공개하겠습니다!!!");
        System.out.println();
        System.out.println("첫번째 참가자! " + p1 + "의 최종 점수는!!! ★☆★ " + PlayerScore[0] +"점 ★☆★ 입니다!!! ");
        System.out.println("두번째 참가자! " + p2 + "의 최종 점수는!!! ★☆★ " + PlayerScore[1] +"점 ★☆★ 입니다!!! ");
        System.out.println("세번째 참가자! " + p3 + "의 최종 점수는!!! ★☆★ " + PlayerScore[2] +"점 ★☆★ 입니다!!! ");
        System.out.println();
        System.out.println("이제 순위 발표 및 상금 수여식이 있겠습니다~");
        System.out.println("최종 우승자는 ! 바로 ~ ! " + WinnerScore +"점을 얻은 ★" + Winner +"★참가자입니다!");
        System.out.println("축하드립니다! 100만원의 상금이 있으니 수령 후 귀가하시길 바랍니다~");
        System.out.println();
        System.out.println("이상 지혜 게임 1회를 마치겠습니다! 즐겨주신 모든 분들 감사드립니다~");
        System.out.println("=========================================================");
    }
}


