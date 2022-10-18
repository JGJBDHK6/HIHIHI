package _1014HRTEST;

public class Pasta extends Cook{
    public Pasta(String title) {
        System.out.println(title);
    }

    @Override
    public void readRecipe() {
        System.out.println("레시피 : 끓는 물에 소금과 올리브 오일을 살짝 넣고 면을 7분간 삶아줍니다. ");
        System.out.println("후라이팬에 얇게 자른 마늘과 올리브오일을 볶다가 생새우를 넣고, 익은 면을 넣어 굴소스와 힘께 섞어줍니다.");
    }

    @Override
    public void prepare() {
        System.out.println("재료 : 면, 소금, 올리브오일, 생새우, 마늘, 굴소스");
    }

    @Override
    public void gasOn() {
        System.out.println("가스 불을 켭니다.");
    }

    @Override
    public void cooking() {
        System.out.println("1. 끓는 물에 올리브 오일과 소금을 약간 넣고 면을 7분간 삶는다.");
        System.out.println("2. 후라이팬에 얇게 자른 마늘과 올리브오일을 볶다가 생새우를 넣는다.");
        System.out.println("3. 새우가 어느정도 익으면 굴소스를 붓고 완전히 섞어준다.");
    }

    @Override
    public void gasOff() {
        System.out.println("가스 불을 끕니다.");
    }

    public void getPasta(){
        readRecipe();
        prepare();
        gasOn();
        cooking();
        gasOff();
        System.out.println();
    }

}
