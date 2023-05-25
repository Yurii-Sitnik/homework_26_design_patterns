package org.example.homework_26.builder;

public class BuilderSedan extends CarBuilder {
    @Override
    public void buildName() {
        car.setName("BMW");
    }

    @Override
    public void buildColor() {
        car.setColor("red");

    }
    @Override
    public void buildMaxSpeed() {
        car.setMaxSpeed(180);

    }
}
