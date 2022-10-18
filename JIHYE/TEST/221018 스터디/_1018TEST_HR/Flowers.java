package _1018TEST_HR;

public abstract class Flowers {
    private String name;
    private String color;
    private String flowerlang;

    Fragrance fragrance;

    public Flowers(String name, String color) {
        this.name = name;
        this.color = color;
        flowerlang = "꽃말";
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getFlowerlang(String flowerlang) {
        return flowerlang;
    }

    abstract void name();
    abstract void flowerGarden();
    abstract void flowerName();

    void info(){
        name();
        flowerGarden();
        flowerName();
    }

    void setFragrance(Fragrance fragrance){
        this.fragrance = fragrance;
    }

    void perfumeFragrance(){
        this.fragrance.perfumeFragrance();
    }

}
/*
    이름과 색깔을 입력 객체 생성 시 입력해주었는데 이를 그대로 가져와서 사용하는 것인지.
    문제에는 getname만 생성하도록 작성. 만일 색깔도 가져와서 사용해야한다고 하면 getcolor 도 필요. => private 니까~!
    
    꽃말은 그냥 프린트한 것인지, 꽃말도 캡슐화를 하여야 한다면 인수 입력받는 getFlowermean 필요

package HRtest;

public abstract class Flower {
    private String name, color, fragrance, flowerName;

    Fragrance f;

    public Flower(String name, String color) {
        this.name = name;
        this.color = color;
        flowerName = " ";
    }


    public String getName() {
        return name;
    }

    public String getColor(){
        return color;
    }

    abstract void name();

    abstract void flowerGarden();

    abstract void flowerName();

    public void info() {
        name();
        flowerGarden();
        flowerName();
    }

    public void setFragrance(Fragrance f) {
        this.f = f;
    }

    public void perfumeFragrance() {
        this.f.fragrance();
    }
}

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

*/