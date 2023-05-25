package org.example.homework_36.builder;

public class BuilderSportCar extends CarBuilder {
    @Override
    public void buildName() {
        car.setName("FERRARI");
    }

    @Override
    public void buildColor() {
        car.setColor("yellow");
    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(230);
    }
}
