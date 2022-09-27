package HIHIHI_Project.src._06클래스;

public class _06Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    _06Car(){ }
    _06Car(String model){
        this.model = model;
    }
    _06Car(String model, String color){
        this.model = model;
        this.color = color;
    }
    _06Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
