package GOF.LabFinalExam;

public class Demo {

    public static void main(String[] args) {
        // Initialize the system components
        Settings systemSettings = Settings.getInstance();
        systemSettings.loadConfiguration(); // Load the initial configuration

        // Initialize NotificationSystem
        NotificationSystem notificationSystem = new NotificationSystem();

        // Create stakeholders
        Student student = new Student("Irfan", 1);
        Teacher teacher = new Teacher("usama", 2);
        Parent parent = new Parent("farhan", 3);
        Administrator admin = new Administrator("Admin", 4);

        // Register stakeholders to the notification system
        notificationSystem.attach(student);
        notificationSystem.attach(teacher);
        notificationSystem.attach(parent);
        notificationSystem.attach(admin);

        // Define a common communication strategy
        NormalCommunication normalCommunication = new NormalCommunication();

        // Setting up a message builder and director
        ConcreteMessageBuilder builder = new ConcreteMessageBuilder();
        Director director = new Director();

        // Constructing and sending a message from the student to the teacher
        director.constructMessage(builder, "Hello, this is a test message from student!", student, teacher);
        Message studentMessage = builder.getMessage();
        student.sendMessage(studentMessage, notificationSystem);

        // Teacher creating and broadcasting an announcement
        Announcement announcement = new Announcement("Reminder: Exam on Monday", teacher);
        SystemFacade systemFacade = new SystemFacade(normalCommunication); // Using normal communication strategy
        teacher.createAnnouncement(announcement, systemFacade);

        // Administrator sending a notification of a new policy
        admin.sendMessage(new Message("New school policy is now active."), notificationSystem);

        // Parent receiving a message
        director.constructMessage(builder, "Parent-teacher meeting invitation.", teacher, parent);
        Message parentMeetingMessage = builder.getMessage();
        parent.receiveNotification(new Notification(parentMeetingMessage.getContent()));

        // Displaying a simple message to indicate the end of the demo
        System.out.println("Demo finished.");
    }
}

