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