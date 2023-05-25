package org.example.homework_36.builder;

public class BuilderHatchback extends CarBuilder {

    @Override
    public void buildName() {
        car.setName("AUDI");
    }

    @Override
    public void buildColor() {
        car.setColor("blue");

    }

    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(190);
    }
}
