package org.example.homework_26.strategy;

public class AreaOfRectangle implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
