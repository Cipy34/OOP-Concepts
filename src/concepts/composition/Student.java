package concepts.composition;

public class Student {
    private String name;
    private User user;

    public Student(String name){
        this.name = name;
    }

    public Student(String name, User user){
        this.name = name;
        this.user = user;
    }

    public void StudentDetails(){
        System.out.println("Name: " + name + user.getUser());
    }
}
