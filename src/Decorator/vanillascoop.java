package Decorator;

public class vanillascoop implements IceCream{

    IceCream ic;
    public vanillascoop(IceCream ic) {
        this.ic = ic;
    }
    @Override
    public int getcost() {

        return ic.getcost()+50;
    }

    @Override
    public String getdesc() {
        return ic.getdesc()+"Vanilla Ice Cream";
    }
}
