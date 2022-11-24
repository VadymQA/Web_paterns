package Lab_2;

public class Main {
    public static void main(String[] args) {

        System.out.println("Should be only 2 messages:");
        User user1 = new User("user1", LocalStorage.getInstance());
        User user2 = new User("user2", AmazonS3Storage.getInstance());

        User user3 = new User("user3", LocalStorage.getInstance());
        User user4 = new User("user4", AmazonS3Storage.getInstance());

    }
}