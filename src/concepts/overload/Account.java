package concepts.overload;

public class Account {
    private String name;
    private String password;
    private String phone;

    public Account(String name, String password, String phone){
        this.name = name;
        this.password = password;
        this.phone = phone;
    }

    public void change(String name){
        this.name = name;
        System.out.println("Name has been changed");
    }

    public void change(String name, String password){
        this.name = name;
        this.password = password;
        System.out.println("Name and password has been changed");
    }

    public void change(String name, String password, String phone){
        this.name = name;
        this.password = password;
        this.phone = phone;
        System.out.println("Name, password and phone has been changed");
    }
}
