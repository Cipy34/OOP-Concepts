package concepts.polymorphism;

public class Car extends Vehicle{
    @Override
    public void description(){
        System.out.println("Bad for the planet, but very fast");
    }
}
