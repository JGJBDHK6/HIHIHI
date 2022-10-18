package HIHIHI_Project.src._06클래스;

public class _07Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    _07Car(){
    }

    _07Car(String model){
        this(model, "그레이색", 250);
    }

    _07Car(String model, String color){
        this(model, color, 250);
    }
    _07Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
