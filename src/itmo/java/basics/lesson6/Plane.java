package itmo.java.basics.lesson6;

public class Plane extends  Transport {

    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {

    }


    @Override
    public void info() {
        System.out.println("SuperJet");
    }

    @Override
    public void printTransportInfo() {
        System.out.println("SuperJet");
    }
}
