package _1014SHTEST;

import java.util.Scanner;

public class RunOrFight implements Pokemon {

    Scanner src = new Scanner(System.in);

    int myPoNum = 0;

    String myPoName = "누굴까요?";

    int myPoPower = 0;
    int myPoSpeed = 0;

    int WinScore = 0;

    int LoseScore = 0;


//    void[] RanPoPower = {  , };
    public void GameStart(){
        System.out.println("=====================================================================");
        System.out.println("오박사 : 어! 왔는가? 이제 자네도 포켓몬트레이너로써의 자질이 있다고 판단되 부르게 되었네!");
        System.out.println("오박사 : 앗! 자네 이름이 뭐였지???");
        String name = src.nextLine();
        System.out.println("오박사 : 그래! " + name + "여!! 이제 어엿한 포켓폰트레이너로써 여행을 시작하는 거다!!");
        System.out.println("오박사 : 너무 어려워 말게나! 초심자용 포켓몬을 준비해 두었으니 하하!");
        System.out.println("오박사 : 이럴때가 아니지! 자 어서 골라보게!");
        System.out.println("========================= 포켓몬 상자가 열린다 ==========================");
        System.out.println("1 꼬부기 | 2 파이리 | 3 이상해씨 ");
        System.out.println("=====================================================================");
        int inPo = src.nextInt();   // inPo - initialPokemon (초기 포켓몬)
        myPoName = InPoName[inPo];
        myPoPower = InPoPower[inPo];
        myPoSpeed = InPoSpeed[inPo];
        System.out.println(name + " : " + myPoName + "! 넌 내꺼야!!!");
        myPoNum = inPo;
    }

    public void RanPokemon1(){
        while (myPoPower < 7) {
            int ranNum = (int) (Math.random() * 6);

            String RPN = RanPoName[ranNum];
            int RPP = RanPoPower[ranNum];
            int RPS = RanPoSpeed[ranNum];

            System.out.println(RPN + "이(가) 나타났다!!!");
            System.out.println("=========================== 포켓몬 도감 ===========================");
            System.out.println(RPN + " | 힘 : " + RPP + " | 속도 : " + RPS);
            System.out.println(myPoName + " | 힘 : " + myPoPower + " | 속도 : " + myPoSpeed);
            System.out.println("0 도망친다 | 1 싸운다 ");
            int ROF = src.nextInt();

            if (ROF == 0) { // 도망친다
                if (myPoSpeed < RPS) {  // 상대보다 속도가 느릴때
                    System.out.println("전투에 돌입한다!");
                    System.out.println("=====================================================================");
                    if (myPoPower < RPP) {  // 상대보다 힘이 약할때
                        System.out.println(myPoName + "이(가) 쓰러졌다");
                        LoseScore += 1;
                    } else if (myPoPower >= RPP) {  // 상대보다 힘이 강할때
                        System.out.println("전투에서 승리했다!");
                        myPoPower += 1;
                        myPoSpeed += 1;
                        WinScore += 1;
                        System.out.println("=====================================================================");
                    }
                } else if (myPoSpeed >= RPS) {  // 상대보다 속도가 빠를때
                    System.out.println("도망에 성공했다!");
                    System.out.println("=====================================================================");
                }
            } else if (ROF == 1) {  // 전투에 돌입한다.
                System.out.println("전투에 돌입한다!");
                System.out.println("=====================================================================");
                if (myPoPower < RPP) {  // 상대보다 힘이 약할때
                    System.out.println(myPoName + "이(가) 쓰러졌다");
                    LoseScore += 1;
                } else if (myPoPower >= RPP) {  // 상대보다 힘이 강할때
                    System.out.println("전투에서 승리했다!");
                    myPoPower += 1;
                    myPoSpeed += 1;
                    WinScore += 1;
                    System.out.println("=====================================================================");
                }
            }
        }
        evolution1();
    }
    public void evolution1(){
        if (myPoPower == 7){
            System.out.println("★★★★★★★★★★★★★★★★★★★★");
            System.out.println("어어?!?!?");
            myPoName = InPoNameE1[myPoNum];
            System.out.println(myPoName + "으로 진화하였다!!!");
            System.out.println("★★★★★★★★★★★★★★★★★★★★");
        }
    }

    public void RanPokemon2(){
        while (myPoPower < 10) {
            int ranNum = (int) (Math.random() * 6);

            String RPN = RanPoName[ranNum];
            int RPP = RanPoPower[ranNum];
            int RPS = RanPoSpeed[ranNum];

            System.out.println(RPN + "이(가) 나타났다!!!");
            System.out.println("=========================== 포켓몬 도감 ===========================");
            System.out.println(RPN + " | 힘 : " + RPP + " | 속도 : " + RPS);
            System.out.println(myPoName + " | 힘 : " + myPoPower + " | 속도 : " + myPoSpeed);
            System.out.println("0 도망친다 | 1 싸운다 ");
            int ROF = src.nextInt();

            if (ROF == 0) { // 도망친다
                if (myPoSpeed < RPS) {  // 상대보다 속도가 느릴때
                    System.out.println("전투에 돌입한다!");
                    System.out.println("=====================================================================");
                    if (myPoPower < RPP) {  // 상대보다 힘이 약할때
                        System.out.println(myPoName + "이(가) 쓰러졌다");
                        LoseScore += 1;
                    } else if (myPoPower >= RPP) {  // 상대보다 힘이 강할때
                        System.out.println("전투에서 승리했다!");
                        myPoPower += 1;
                        myPoSpeed += 1;
                        WinScore += 1;
                        System.out.println("=====================================================================");
                    }
                } else if (myPoSpeed >= RPS) {  // 상대보다 속도가 빠를때
                    System.out.println("도망에 성공했다!");
                    System.out.println("=====================================================================");
                }
            } else if (ROF == 1) {  // 전투에 돌입한다.
                System.out.println("전투에 돌입한다!");
                System.out.println("=====================================================================");
                if (myPoPower < RPP) {  // 상대보다 힘이 약할때
                    System.out.println(myPoName + "이(가) 쓰러졌다");
                    LoseScore += 1;
                } else if (myPoPower >= RPP) {  // 상대보다 힘이 강할때
                    System.out.println("전투에서 승리했다!");
                    myPoPower += 1;
                    myPoSpeed += 1;
                    WinScore += 1;
                    System.out.println("=====================================================================");
                }
            }
        }
        evolution2();
    }
    public void evolution2(){
        if (myPoPower == 10){
            System.out.println("★★★★★★★★★★★★★★★★★★★★");
            System.out.println("어어?!?!?");
            myPoName = InPoNameE2[myPoNum];
            System.out.println(myPoName + "으로 최종진화하였다!!!");
            System.out.println("승리 횟수 : " + WinScore + " | 패배 횟수 : " + LoseScore);
            System.out.println("★★★★★★★★★★★★★★★★★★★★");
        }
    }

    public void TravelStart(){
        GameStart();
        RanPokemon1();
        RanPokemon2();
    }
}
