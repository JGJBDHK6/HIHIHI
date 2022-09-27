package HIHIHI_Project.src._06클래스;

public class _06CarExample {
    public static void main(String[] args) {
        _06Car c1 = new _06Car();
        System.out.println("car1.company: " + c1.company);
        System.out.println();

        _06Car c2 = new _06Car("자가용");
        System.out.println("car2.company: " + c2.company);
        System.out.println("car2.model: " + c2.model);
        System.out.println();

        _06Car c3 = new _06Car("자가용", "빨강");
        System.out.println("car3.company: " + c3.company);
        System.out.println("car3.model: " + c3.model);
        System.out.println("car3.color: " + c3.color);
        System.out.println();

        _06Car c4 = new _06Car("택시", "검정", 200);
        System.out.println("car4.company: " + c4.company);
        System.out.println("car4.model: " + c4.model);
        System.out.println("car4.color: " + c4.color);
        System.out.println("car4.maxSpeed: " + c4.maxSpeed);
        System.out.println();
    }
}
