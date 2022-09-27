package HIHIHI_Project.src._06클래스;

public class _12Car {
    int speed;

    public int getSpeed() {
        return speed;
    }

    void KeyTurnOn(){
        System.out.println("키를 돌립니다.");
    }

    void run(){
        for(int i = 0; i <= 50; i+=10){
            speed += 10;
            System.out.println("달립니다.(시속:" + speed + "km/h" + ")");
        }
    }
}
