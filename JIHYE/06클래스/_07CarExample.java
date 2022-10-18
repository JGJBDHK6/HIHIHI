package HIHIHI_Project.src._06클래스;

public class _07CarExample {
    public static void main(String[] args) {
        _07Car c1 = new _07Car();
        System.out.println("c1.company: " + c1.company);
        System.out.println();

        _07Car c2 = new _07Car("자가용");
        System.out.println("c2.company: " + c2.company);
        System.out.println("c2.model: " + c2.model);
        System.out.println();

        _07Car c3 = new _07Car("자가용","빨강");
        System.out.println("c3.company: " + c3.company);
        System.out.println("c3.model: " + c3.model);
        System.out.println("c3.color: " + c3.color);
        System.out.println();

        _07Car c4 = new _07Car("자가용","빨강", 200);
        System.out.println("c4.company: " + c4.company);
        System.out.println("c4.model: " + c4.model);
        System.out.println("c4.color: " + c4.color);
        System.out.println("c4.maxSpeed " + c4.maxSpeed);
        System.out.println();
    }
}
