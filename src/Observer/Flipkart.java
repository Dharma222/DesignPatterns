package Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {

    public static Flipkart flipkart;

    public static Flipkart getFlipkart() {
        if (flipkart == null) {
            flipkart = new Flipkart();
        }
        return flipkart;
    }

    List<RegisteredSubsribers> ops = new ArrayList<>();

    public void RegisterSubsribers(RegisteredSubsribers rs) {
        ops.add(rs);
    }

    public void OrderPlaced()
    {
        for(RegisteredSubsribers rs : ops)
        {
            rs.anOrderPlaced();
        }
    }
}
