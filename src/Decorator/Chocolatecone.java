package Decorator;

public class Chocolatecone implements IceCream{

    IceCream ic;
    public Chocolatecone(IceCream ic) {
        this.ic = ic;
    }

    @Override
    public int getcost() {
        if(ic==null)
            return 20;
        return ic.getcost()+20;
    }

    @Override
    public String getdesc() {
        if(ic==null)
            return "Chocolate";
        return ic.getdesc()+"Chocolate";
    }
}
