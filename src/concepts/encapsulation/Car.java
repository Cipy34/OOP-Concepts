package concepts.encapsulation;

public class Car {
    private String brand, model;
    private double price;

    public Car(String brand, String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public void discount(double percent){
        if(percent > 0){
            this.price = this.price - this.price*percent/100;
            System.out.println("The discount of " + percent + "% has been applied");
        }
        else{
            System.out.println("The percent needs to be greater than 0");
        }
    }
}
