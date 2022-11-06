package Lab_2;

public class Main {
    public static void main(String[] args) {

        UserDB storage1 = new AmazonS3Storage();
        UserDB storage2 = new LocalStorage();

        User user1 = User.getStorage(storage1);
        User user2 = User.getStorage(storage2);

    }
}