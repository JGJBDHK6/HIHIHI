package _1014HRTEST;

public class Pizza extends Cook{

    public Pizza(String title) {
        System.out.println(title);
    }

    @Override
    public void readRecipe() {
        System.out.println("레시피 : 또띠아 위에 케첩을 얇게 바르고 그 위에 잘게 자른 양파, 햄, 피망을 올린 후 치즈를 맨 위에 뿌려 오븐에 굽습니다.");
    }

    @Override
    public void prepare() {
        System.out.println("재료 : 또띠아, 햄, 케첩, 양파, 치즈, 피망");
    }

    @Override
    public void gasOn() {
        System.out.println("가스 불을 켭니다.");
    }

    @Override
    public void cooking() {
        System.out.println("1. 또띠아에 케첩을 바른다.");
        System.out.println("2. 재료를 모두 올린다.");
        System.out.println("3. 오븐에 구워 완성한다.");
    }

    @Override
    public void gasOff() {
        System.out.println("가스 불을 끕니다.");
    }

    public void getPizza(){
        readRecipe();
        prepare();
        gasOn();
        cooking();
        gasOff();
        System.out.println();
    }
}
