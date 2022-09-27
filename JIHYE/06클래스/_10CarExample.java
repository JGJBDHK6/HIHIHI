package HIHIHI_Project.src._06클래스;

public class _10CarExample {
    public static void main(String[] args) {
        _10Car mC = new _10Car();

        mC.setGas(5);

        boolean gasState = mC.isLeftGas();
        if(gasState){
            System.out.println("출발합니다.");
            mC.run();
        }
        if(mC.isLeftGas()){
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
