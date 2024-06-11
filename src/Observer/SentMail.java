package Observer;

public class SentMail implements RegisteredSubsribers{

    public SentMail() {
        Flipkart f = Flipkart.getFlipkart();
        f.RegisterSubsribers(this);
    }
    @Override
    public void anOrderPlaced() {
        call();
    }

    public void call() {
        System.out.println("Email was sent");
    }
}
