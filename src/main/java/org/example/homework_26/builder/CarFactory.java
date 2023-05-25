package org.example.homework_36.builder;

public class CarFactory {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder cb) {
        carBuilder = cb;
    }

    public Car getCar() {
        return carBuilder.getCar();
    }

    public void constructCar() {
        carBuilder.createNewCar();
        carBuilder.buildName();
        carBuilder.buildColor();
        carBuilder.buildMaxSpeed();
    }
}
