package _04조건문과반복문;

public class Exercise04 {
    public static void main(String[] args) {
        while(true){
            int e1 = (int)(Math.random() * 6 ) + 1;
            int e2 = (int)(Math.random() * 6 ) + 1;
            if ((e1+e2) == 5){
                System.out.println("(" + e1 + " , " + e2 + ")");
                break;
            }
            System.out.println("("+e1+" , "+e2+")");
        }
    }
}
