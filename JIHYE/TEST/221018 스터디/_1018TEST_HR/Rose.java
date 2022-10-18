package _1018TEST_HR;

public class Rose extends Flowers{
    public Rose(String name, String color) {
        super(name, color);
    }

    @Override
    void name() {
        System.out.println("이름 : " + getName() + ", 색깔 : " + getColor() + "색");
    }

    @Override
    void flowerGarden() {
        System.out.println(getColor() + "색 꽃밭이 펼쳐집니다");
    }

    @Override
    void flowerName() {
        System.out.println("꽃말은 " + getFlowerlang("사랑의 맹세") + "입니다.");
        System.out.println();
    }
}
