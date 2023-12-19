package concepts.inheritance;

public class Engineer extends Person {
    public Engineer(String name) {
        super(name);
    }

    public void vocalFromEngineer(){
        System.out.println("Hello! I am " + name + " and I am an engineer!");
    }
}
