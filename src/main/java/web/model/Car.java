package web.model;

public class Car {
    
    private String make;
    private String model;
    private int price;
    
    public Car() {
    }
    
    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }
    
    public String getMake() {
        return make;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public long getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return make + " " + model + " = " + price + "p";
    }
}
