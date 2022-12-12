package itmo.java.basics.lesson12.builder;

public class SecondHouse extends Builder{

    public SecondHouse() {
        house = new House();
    }

    @Override
    public House buildHouse() {
        house.buildBase();
        house.buildWalls();
        house.buildFloors();
        return house;
    }
}
