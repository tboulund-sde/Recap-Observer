package dk.easv;

public class OnlineMeeting {
    private String subject;
    private boolean hasStarted;

    public OnlineMeeting(String subject) {
        this.subject = subject;
    }

    public boolean isHasStarted() {
        return hasStarted;
    }

    public void start() {
        hasStarted = true;
    }
}
