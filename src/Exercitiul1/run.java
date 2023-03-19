package Exercitiul1;
public class run{
    public static void main(String[] args) {
        Advertisment Facebook = new FacebookAdvertisment("New service", "Check out our new service!", 100);
        Facebook.display();
        Facebook.promote();

        Advertisment emailAd = new EmailAdvertisment("example@example.com", "New service", "Check out our new service!", 50);
        emailAd.display();
        emailAd.promote();

        Advertisment printAd = new PrintAdvertisement("New service", "Check out our new service!", 200);
        printAd.display();
        printAd.promote();
    }
}

