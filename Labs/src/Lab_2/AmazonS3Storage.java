package Lab_2;

public class AmazonS3Storage implements UserDB {

    private static AmazonS3Storage instance;

    private AmazonS3Storage() {
    }

    public static AmazonS3Storage getInstance() {
        if (instance == null) {
            instance = new AmazonS3Storage();
        }
        return instance;
    }

    @Override
    public void saveData() {
        System.out.println("Data is saved on your Amazon acc");
    }
}
