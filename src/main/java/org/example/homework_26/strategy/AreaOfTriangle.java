package org.example.homework_26.strategy;

public class AreaOfTriangle implements Strategy {
    @Override
    public int execute(int a, int b) {
        return (a * b) / 2;
    }
}
