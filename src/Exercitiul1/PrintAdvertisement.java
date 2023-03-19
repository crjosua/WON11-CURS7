package Exercitiul1;

public class PrintAdvertisement implements Advertisment {
    private String title;
    private String message;
    private int cost;

    public PrintAdvertisement(String title, String message, int cost) {
        this.title = title;
        this.message = message;
        this.cost = cost;
    }

    public void display() {
        System.out.println("Print advertisement: " + title + " - " + message + " - $ " + cost);
    }

    public void promote() {
        System.out.println("Promoting Print advertisement: " + title + " - " + message);
    }
}
