package web.model;

public class Car {
    private String model;
    private String color;
    private int id;

    public Car(String model, String color, int id) {
        this.model = model;
        this.color = color;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }
}
