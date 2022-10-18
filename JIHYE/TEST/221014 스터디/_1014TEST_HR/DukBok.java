package _1014HRTEST;

public class DukBok extends Cook{

    public DukBok(String title) {
        System.out.println(title);
    }

    @Override
    public void readRecipe() {
        System.out.println("레시피 : 끓는 물에 소스를 풀고 미리 불려둔 떡과 오뎅을 넣습니다.");
        System.out.println("떡과 오뎅에 소스가 충분히 묻으면 파와 치즈를 넣고 마무리합니다.");
    }

    @Override
    public void prepare() {
        System.out.println("재료 : 떡, 오뎅, 소스, 파, 치즈");
    }

    @Override
    public void gasOn() {
        System.out.println("가스 불을 켭니다.");
    }

    @Override
    public void cooking() {
        System.out.println("1. 끓는 물에 소스를 풀고 미리 불려둔 떡과 오뎅을 넣는다.");
        System.out.println("2. 떡과 오뎅에 소스가 충분히 스며들면 파와 치즈를 넣는다.");
    }

    @Override
    public void gasOff() {
        System.out.println("가스 불을 끕니다.");
    }

    public void getDukBok(){
        readRecipe();
        prepare();
        gasOn();
        cooking();
        gasOff();
        System.out.println();
    }
}
