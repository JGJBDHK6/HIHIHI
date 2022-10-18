package HRtest;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower carnation = new Carnation("카네이션", "빨강", "부모님");
        carnation.info();

        Flower tulip = new Tulip("튤립", "노랑");
        tulip.info();
        Flower rose = new Rose("장미", "분홍");
        rose.info();
        rose.setFragrance(new SmellFragrance());
        rose.perfumeFragrance();
        rose.setFragrance(new KeepFragrance());
        rose.perfumeFragrance();
    }
}
