package HRtest;

public class Tulip extends Flower {
    public Tulip(String name, String color) {
        super(name, color);
    }

    @Override
    public void name() {
        System.out.println("이름 : " + super.getName() +", 색깔 : " + super.getColor() + "색");
    }

    @Override
    public void flowerGarden() {
        System.out.println(super.getColor() + "색 꽃밭이 펼쳐집니다.");
    }

    @Override
    public void flowerName() {
        System.out.println("꽃말은 모정, 사랑입니다."+"\n");
    }

}
