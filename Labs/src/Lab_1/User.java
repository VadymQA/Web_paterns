package Lab_1;

public class User {
    private String fullName;
    private Role role;

    public User(String fullName, Role role) {
        this.fullName = fullName;
        this.role = role;
    }

    public String getFullName(){
        return fullName;
    }


    @Override
    public String toString() {
        return "Hi " + fullName + "!";
    }
}
