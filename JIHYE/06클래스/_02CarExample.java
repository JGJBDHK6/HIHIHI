package HIHIHI_Project.src._06클래스;

public class _02CarExample {
    public static void main(String[] args) {
        _02Car c1 = new _02Car();

        System.out.println("제작 회사: " + c1.company);
        System.out.println("모델명: " + c1.model);
        System.out.println("차량 색상: " + c1.color);
        System.out.println("최고 속도: " + c1.maxSpeed);
        System.out.println("현재 속도: " + c1.speed);

        c1.speed = 60;
        System.out.println("수정 속도: " + c1.speed);

    }
}
