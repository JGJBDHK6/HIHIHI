package _1014JHTEST;

import java.util.Scanner;

public class GamePlayTest2 {
    public static void main(String[] args) {
//        int Player = 0;
        int playerScore = 0;

        Scanner src = new Scanner(System.in);

        System.out.print(">>>");
        int Player = src.nextInt();
        if (Player == 1){
            int Dice1Num = (int)(Math.random() * 6 ) + 4;

            playerScore += Dice1Num;

        } else if (Player == 2) {
            int Dice2Num_1 = (int)(Math.random() * 6 ) + 1;
            int Dice2Num_2 = (int)(Math.random() * 6 ) + 1;

            playerScore = playerScore + Dice2Num_1 + Dice2Num_2;
        }

        System.out.println("p1 선택: 주사위 " + Player +"개! p1 득점 점수: " + playerScore);

    }
}
