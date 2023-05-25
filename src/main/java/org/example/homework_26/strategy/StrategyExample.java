package org.example.homework_26.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new AreaOfTriangle());
        int resultAreaOfTriangle= context.executeStrategy(3, 4);
        System.out.println("AreaOfTriangle " + resultAreaOfTriangle);

        context.setStrategy(new AreaOfRectangle());
        int resultAreaOgRectangle = context.executeStrategy(5, 5);
        System.out.println("AreaOfRectangle "+resultAreaOgRectangle);
    }
}
