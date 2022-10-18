package _1014JHTEST;

import java.util.Scanner;
public class StartGame extends KindOfGame {

    Scanner src = new Scanner(System.in);

    public void GameStart(){
        StartDetail();
    }

    public void RSPGame(){
        RSPGameDetail();
    }

    public void OOEGame(){
        OOEGameDetail();
    }

    public void DiceRun(){
        DiceRunDetail();
    }

    public void finishGame(){
        finishGameDetail();
    }

}
