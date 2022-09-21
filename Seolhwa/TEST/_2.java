import java.util.Scanner;
public class _2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i =1;
        int x =0;
        while((i<=a)&&(i<=b)){
            if((a%i==0) && (b%i==0)){
                if(i==i){
                    x=i;

                }
            }
            i++;
                }
        System.out.println("최대공약수는 과연????"+x+"입니다");
    }
        }







