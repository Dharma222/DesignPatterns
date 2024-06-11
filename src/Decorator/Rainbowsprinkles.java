package Decorator;

public class Rainbowsprinkles implements IceCream{
    IceCream ic ;
    public Rainbowsprinkles(IceCream ic){
        this.ic = ic;
    }
    @Override
    public int getcost() {
        return ic.getcost()+15;
    }

    @Override
    public String getdesc() {
        return ic.getdesc()+"Rainbowsprinkles";
    }
}
