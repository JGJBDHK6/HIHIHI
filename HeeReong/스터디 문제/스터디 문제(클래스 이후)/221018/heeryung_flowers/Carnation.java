package HRtest;

public class Carnation extends Flower {

    private String Present;

    public Carnation(String name, String color, String Present) {
        super(name, color);
        this.Present = Present;
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
        System.out.println("꽃말은 사랑의 고백입니다.");
        System.out.println("선물 대상 : " + Present + "\n");
    }


}
