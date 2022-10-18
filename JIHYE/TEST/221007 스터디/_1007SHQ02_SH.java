package _TEST;

public class _1007SHQ02_SH extends _1007SHQ01 {

    public _1007SHQ02_SH(String account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void customer() {
        System.out.println("[신한은행 / " + account + " / " + name + "]");
    }
    @Override
    public void bankbook() {
        System.out.println("통장개설 성공!!");
    }

    @Override
    public void savemoney() {
        System.out.println(pay + "원 정기예금 개설 성공!");
    }

    private boolean isPrime(){
        boolean prime = true;
        int ranNum = (int)(Math.random() * 10 ) + 1;
        if ( ranNum != 1 ){
            for(int i = 2; i < ranNum; i++){
                if((ranNum % i) == 0){
                    prime = false;
                }
            }
        } else {
            prime = true;
        }
        return prime;
    }

    public double getInterest() {
        int inter;
        if (isPrime() == true){
            inter = pay * 5 / 100;
        } else {
            inter = pay * 2 / 100;
        }
        System.out.println("해당 정기예금의 이자는 " + inter +"원");
        System.out.println("-----------------------------------------");
        return inter;
    }
}
