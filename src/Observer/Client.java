package Observer;

public class Client {
    public static void main(String[] args) {

        Flipkart f = Flipkart.getFlipkart();
        SentMail s = new SentMail();
        Notification n = new Notification();

        f.OrderPlaced();

    }
}
