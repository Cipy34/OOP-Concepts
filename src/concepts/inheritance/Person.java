package concepts.inheritance;

public class Person {
    String name;

    public Person(String name){
        this.name = name;
    }

    public void vocalFromPerson(){
        System.out.println("Hello! I am " + name + " and I am looking for a job!");
    }
}
