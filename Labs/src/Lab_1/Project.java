package Lab_1;

import java.util.*;

public class Project {

    private String name;
    private List<User> users = new ArrayList<>();
    private User admin;
    private iSender sender;
    private Map<String, Task> tasks = new HashMap<>();

    public Project(String name, List<User> users, User admin, iSender commService) {
        this.name = name;
        this.users.addAll(users);
        this.admin = admin;
        this.sender = commService;
    }

    public void addUser(User user){
        users.add(user);
        sender.send("new user: "+ user.getFullName() + ", added to project: " + name, Arrays.asList(admin));
    }

    public void addTask(Task task) {
//        tasks.put(task.getTitle(), task);
        sender.send("new Task: "+ task.getTitle() + ", added to project: " + name, Arrays.asList(admin));
    }



}
