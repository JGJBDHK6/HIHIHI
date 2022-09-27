package HIHIHI_Project.src._06클래스;

public class _11Calculator {
    int plus(int x, int y){
        int result = x + y;
        return result;
    }

    double avg(int x, int y){
        double sum = x + y;
        double result = sum / 2;
        return result;
    }

    void excute(){
        double result = avg(8,15);
        println("실행결과: " + result);
    }

    void println(String message){
        System.out.println(message);
    }
}
