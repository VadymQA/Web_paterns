package Lab_2;

public class LocalStorage implements UserDB {

    private static LocalStorage instance;

    private LocalStorage() {
    }

    public static LocalStorage getInstance() {
        if (instance == null) {
            instance = new LocalStorage();
        }
        return instance;
    }

    @Override
    public void saveData() {
        System.out.println("Data is saved on you local disk");
    }
}
