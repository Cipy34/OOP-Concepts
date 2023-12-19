package concepts.composition;

public class User {
    private String user_name;
    private String password;

    public User(String user_name, String password){
        this.user_name = user_name;
        this.password = password;
    }

    public String getUser(){
        return " User name: " + user_name + " Password: " + password;
    }
}
