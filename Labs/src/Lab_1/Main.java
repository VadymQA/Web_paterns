package Lab_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        iLogger logger = new MyLogger();

        User admin = new User("Admin", Role.ADMIN);
        User admin2 = new User("Admin2", Role.ADMIN);

        User user1 = new User("Josh", Role.USER);
        User user2 = new User("Kevin", Role.USER);
        User user3 = new User("Mark", Role.USER);
        User newUser = new User("Bob", Role.USER);


        //test all sender
        EmailSender sender = new EmailSender();
        SMSSender sender2 = new SMSSender();
        MessagerSender sender3 = new MessagerSender();

        Project project = new Project("Project A", Arrays.asList(user1, user2, user3), admin, sender);
        project.addUser(newUser);
        project.addTask(new Task(logger, "started", "Task #1", admin2));


        Project project2 = new Project("Project B", Arrays.asList(user1, user2, user3), admin, sender2);
        project2.addUser(newUser);
        project2.addTask(new Task(logger, "started", "Task #2", admin2));


        Project project3 = new Project("Project C", Arrays.asList(user1, user2, user3), admin, sender3);
        project3.addUser(newUser);
        project3.addTask(new Task(logger, "started", "Task #3", admin2));




    }
}