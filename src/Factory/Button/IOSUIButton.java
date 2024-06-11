package Factory.Button;

public class IOSUIButton implements Button{
    @Override
    public void changesize() {
        System.out.println("IOSUIButton");
    }
}
