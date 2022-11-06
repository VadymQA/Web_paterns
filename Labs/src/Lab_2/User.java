package Lab_2;

public final class User {
    private static User instance;
    public String value;

    private User(UserDB storage) {

    }

    public static User getStorage(UserDB storage) {
        if (instance == null) {
            instance = new User(storage);
        }
        return instance;
    }
}