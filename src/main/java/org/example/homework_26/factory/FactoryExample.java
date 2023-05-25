package org.example.homework_26.factory;

public class FactoryExample {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new FurnitureFactory();

        Furniture chair = furnitureFactory.getFurniture(FurnitureTypes.CHAIR);
        Furniture shelf = furnitureFactory.getFurniture(FurnitureTypes.SHELF);
        Furniture sofa = furnitureFactory.getFurniture(FurnitureTypes.SOFA);
        Furniture table = furnitureFactory.getFurniture(FurnitureTypes.TABLE);

        chair.furnitureBuilding();
        shelf.furnitureBuilding();
        sofa.furnitureBuilding();
        table.furnitureBuilding();
    }
}

