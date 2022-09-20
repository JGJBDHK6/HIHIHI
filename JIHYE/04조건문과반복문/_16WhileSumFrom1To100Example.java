package _04조건문과반복문;

public class _16WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        int i = 1;

        while(i<=100){
            sum += i;
            i++;
        }
        System.out.println("1~" + (i-1)+" 합 : " + sum);

/*      while문을 for문으로 작성할때 ! i는 for문 전에 선언해야 print할때 i 사용 가능 !
        int sum = 0;
        int i = 1;
        for(;i<=100;i++){
            sum += i;
        }
        System.out.println("1~" + (i-1) + " 합 : " + sum);
*/
    }
}
