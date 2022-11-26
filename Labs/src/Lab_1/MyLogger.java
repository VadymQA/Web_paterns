package Lab_1;

public class MyLogger implements iLogger {

    @Override
    public void log(String msg) {
        //some code
        System.out.println(msg + " is logged");
    }
}
