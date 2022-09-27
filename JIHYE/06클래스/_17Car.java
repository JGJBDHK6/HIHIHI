package HIHIHI_Project.src._06클래스;

public class _17Car {
    int speed;

    void run(){
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        _17Car C1 = new _17Car();
        C1.speed = 60;
        C1.run();
    }
}
