package org.example.homework_36.builder;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }
    public void createNewCar(){
        car = new Car();
    }

    public abstract void buildName();

    public abstract void buildColor();

    public abstract void buildMaxSpeed();

}
