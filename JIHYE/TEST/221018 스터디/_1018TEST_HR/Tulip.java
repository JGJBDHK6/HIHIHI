package _1018TEST_HR;

public class Tulip extends Flowers{
    public Tulip(String name, String color) {
        super(name, color);
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
        System.out.println("꽃말은 " + getFlowerlang("모정, 사랑") + "입니다.");
        System.out.println();
    }
}
