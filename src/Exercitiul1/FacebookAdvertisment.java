package Exercitiul1;

public class FacebookAdvertisment implements Advertisment {
    private String title;
    private String message;
    private int cost;

    public FacebookAdvertisment(String title, String message, int cost) {
        this.title = title;
        this.message = message;
        this.cost = cost;
    }

    public void display() {
        System.out.println("Facebook advertisement: " + title + " - " + message + " - $ " + cost);
    }

    public void promote() {
        System.out.println("Promoting Facebook advertisment :" + title + " - " + message);
    }
}

