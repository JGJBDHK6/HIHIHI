package _1018TEST_HR;

public class FlowerDemo {
    public static void main(String[] args) {

        Flowers carnation = new Carnation("카네이션", "빨강", "부모님");
        carnation.info();

        Flowers tulip = new Tulip("튤립", "노랑");
        tulip.info();
        Flowers rose = new Rose("장미", "분홍");
        rose.info();
        rose.setFragrance(new SmellFragrance());
        rose.perfumeFragrance();
        rose.setFragrance(new KeepFragrance());
        rose.perfumeFragrance();
    }
}
