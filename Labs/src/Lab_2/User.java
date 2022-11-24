package Lab_2;

public final class User {

    private String username;
    private UserDB userDB;


    private User(UserDB userDB, String username ) {
        this.userDB = userDB;
        this.username = username;
    }

    public void setUserDB(UserDB userDB){
        this.userDB = userDB;
    }

    public UserDB getUserDB() {
        return userDB;
    }
}