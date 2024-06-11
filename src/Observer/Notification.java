package Observer;

public class Notification implements RegisteredSubsribers{

    public Notification()
    {
        Flipkart f =Flipkart.getFlipkart();
        f.RegisterSubsribers(this);
    }
    @Override
    public void anOrderPlaced() {
        sent();
    }
    public void sent() {
        System.out.println("Notification sent");
    }
}
