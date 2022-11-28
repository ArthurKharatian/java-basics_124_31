package itmo.java.basics.lesson6;

public abstract class Transport implements Moveable {

    protected Integer weight;
    protected Integer seatPlace;
    protected Boolean isFlying;


    public Transport(Integer weight, Integer seatPlace, Boolean isFlying) {
        this.weight = weight;
        this.seatPlace = seatPlace;
        this.isFlying = isFlying;
    }


    abstract void abstractMethod();


    public void info() {
        //logic
    }

    @Override
    public String transportName() {
        return "some transport";
    }
}
