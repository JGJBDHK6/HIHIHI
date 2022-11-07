package Lv00;
// 배열의 평균 값
// 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.

public class arrangeAverage {
    public double solution(int[] numbers) {
        double avg=0.0;
        double sum=0.0;

        if(numbers.length>=1 && numbers.length<=100){
            for(int i=0; i<numbers.length; i++){
                sum += numbers[i];
            }avg = sum /(double)numbers.length;
        }return avg;
    }
}
