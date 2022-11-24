package Lab_2;

public class LocalStorage implements UserDB {

    private static LocalStorage instance;

    private LocalStorage() {
        System.out.println("Instance LocalStorage was created");
    }

    public static LocalStorage getInstance() {
        if (instance == null) {
            instance = new LocalStorage();
        }
        return instance;
    }

    @Override
    public void saveData() {

        //some code
    }
}
