package _04조건문과반복문;

public class _09SwitchStringExample {
    public static void main(String[] args) {
        String position = "과장";

        switch(position) {
            case "부장":
                System.out.println("700만원, 부럽네");
                break;
            case "과장":
                System.out.println("500만원, 와우");
                break;
            default:
                System.out.println("300만원");
        }
    }
}
