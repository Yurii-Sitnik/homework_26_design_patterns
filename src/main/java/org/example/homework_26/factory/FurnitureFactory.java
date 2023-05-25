package org.example.homework_26.factory;

public class FurnitureFactory {
    public Furniture getFurniture(FurnitureTypes type) {
        Furniture toReturn = null;
        switch (type) {
            case SOFA:
                toReturn = new Sofa();
                break;
            case CHAIR:
                toReturn = new Chair();
                break;
            case TABLE:
                toReturn = new Table();
                break;
            case SHELF:
                toReturn = new Shelf();
                break;
            default:
                throw new IllegalArgumentException("Wrong furniture type:" + type);

        }
        return toReturn;
    }
}


