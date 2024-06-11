package Decorator;

public class Ornagecone implements IceCream{
    IceCream ic;

    public Ornagecone(IceCream ic) {
        this.ic =ic;
    }

    public  int getcost()
    {
        if(ic==null)
            return 10;
        else
            return ic.getcost()+10;
    }
    public String getdesc()
    {
        if(ic==null)
            return "Ornagecone";
        return ic.getdesc()+"Ornagcone";
    }
}
