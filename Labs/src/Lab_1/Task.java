package Lab_1;

public class Task {

    private final iLogger log;

    private String status;
    private String title;
    private User assigned;

    public Task(iLogger log) {
        this.log = log;
    }

    public Task(iLogger log, String status, String title, User assigned) {
        this.log = log;
        this.status = status;
        this.title = title;
        this.assigned = assigned;
    }

    public String getTitle() {
        return title;
    }


    @Override
    public String toString() {
        return "Task" + title + "changed status to: " + status + "! Assigned to " + assigned;
    }
}
