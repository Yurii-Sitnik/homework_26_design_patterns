package org.example.homework_36.strategy;

public class AreaOfRectangle implements Strategy {

    @Override
    public int execute(int a, int b) {
        return a*b;
    }
}
