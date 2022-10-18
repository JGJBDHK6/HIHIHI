package _1018TEST_HR;

public class Carnation extends Flowers{
    String Present;

    public Carnation(String name, String color, String present) {
        super(name, color);
        Present = present;
    }

    @Override
    void name() {
        System.out.println("이름 : " + super.getName() + ", 색깔 : " + super.getColor() + "색");
    }

    @Override
    void flowerGarden() {
        System.out.println(getColor() + "색 꽃밭이 펼쳐집니다");
    }

    @Override
    void flowerName() {
        System.out.println("꽃말은 " + getFlowerlang("사랑의 고백") + "입니다.");
        System.out.println("선물 대상 : " + Present );
        System.out.println();
    }
}
