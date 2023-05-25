package org.example.homework_26.builder;

public class BuilderExample {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        CarBuilder builderSedan = new BuilderSedan();
        carFactory.setCarBuilder(builderSedan);
        carFactory.constructCar();

        Car car = carFactory.getCar();
        System.out.println(car);

    }
}
