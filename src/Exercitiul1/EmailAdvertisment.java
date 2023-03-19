package Exercitiul1;

public class EmailAdvertisment implements Advertisment {
    private String recipient;
    private String subject;
    private String message;
    private int cost;

    public EmailAdvertisment(String recipient, String subject, String message, int cost) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.cost = cost;
    }

    public void display() {
        System.out.println("Email advertisment: To : " + recipient + " - Subject:" + subject + " - " + message + " -$ " + cost);
    }

    public void promote() {
        System.out.println("Promoting Email advertisment: To :" + recipient + " - Subject: " + subject + " - " + message);
    }
}
