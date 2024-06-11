package Decorator;

public class Main {
    public static void main(String[] args) {
        IceCream ic = new Rainbowsprinkles(new vanillascoop(new Chocolatecone(null)));
        int cost = ic.getcost();
        System.out.println(cost);

    }
}
