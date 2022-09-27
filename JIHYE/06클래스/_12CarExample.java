package HIHIHI_Project.src._06클래스;

public class _12CarExample {
    public static void main(String[] args) {
        _12Car C1 = new _12Car();

        C1.KeyTurnOn();
        C1.run();
        int speed = C1.getSpeed();
        System.out.println("현재 속도: " + speed + "km/h");
    }
}
