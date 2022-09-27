package HIHIHI_Project.src._06클래스;

public class _09Computer {
    int sum1(int[] values){
        int sum = 0;
        for (int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }

    int sum2(int ... values){
        int sum = 0;
        for(int i = 0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
}
