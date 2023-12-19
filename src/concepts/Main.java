package concepts;
import concepts.abstraction.Addition;
import concepts.composition.Student;
import concepts.composition.User;
import concepts.encapsulation.Car;
import concepts.inheritance.Engineer;
import concepts.inheritance.Person;
import concepts.overload.Account;
import concepts.polymorphism.Bicycle;
import concepts.polymorphism.Vehicle;

public class Main {

    public static void dynamic(Vehicle v){
        v.description();
    }
    public static void main(String[] args) {
        //encapsulation
        Car c = new Car("Porsche", "911", 250_000);
        c.discount(15);
        System.out.println(c.getPrice());

        //inheritance
        Person p = new Person("Ciprian");
        p.vocalFromPerson();
        Engineer p2 = new Engineer("Marcel");
        p2.vocalFromPerson();
        p2.vocalFromEngineer();

        //composition
        Student s = new Student("Ciprian", new User("Cipy34", "123"));
        s.StudentDetails();

        //abstraction
        Addition a = new Addition(1, 2);
        a.solve();

        //polymorphism
        Vehicle v1 = new Bicycle();
        Vehicle v2 = new concepts.polymorphism.Car();

        //static polymorphism
        v1.description();
        v2.description();

        //dynamic dispatch
        dynamic(v1);
        dynamic(v2);

        //overloading
        Account ac = new Account("Ciprian", "123", "073XXX");
        ac.change("Gabriel");
        ac.change("Gabriel", "124");
        ac.change("Gabriel", "124", "072XXX");
    }
}