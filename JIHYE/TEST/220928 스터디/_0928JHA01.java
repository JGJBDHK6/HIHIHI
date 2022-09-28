package HIHIHI_Project.src.Test;

class commonDivisor{
    // 필드
    int Num1;
    int Num2;

    // 생성자
    public commonDivisor(){
        this.Num1 = 1;
        this.Num2 = 1;
    }

    public commonDivisor(int Num1, int Num2){
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    // 메소드
    public int getDivisor(){
        int CD = 0;
        for (int i = 1; (i <= Num1) && (i <= Num2); i++){
            if (( Num1 % i == 0 ) && ( Num2 % i == 0)){
                CD = i;
            }
        }
        System.out.println("최대공약수는 : " + CD + "입니다!");
        return CD;
    }

    public void setNum1(int num1) {
        Num1 = num1;
    }

    public void setNum2(int num2) {
        Num2 = num2;
    }
}

public class _0928JHA01 {
    public static void main(String[] args) {
        commonDivisor CD1 = new commonDivisor(34850,98564);
        CD1.getDivisor();

        commonDivisor CD2 = new commonDivisor();
        CD2.getDivisor();
        CD2.setNum1(34850);
        CD2.setNum2(98564);
        CD2.getDivisor();
    }
}