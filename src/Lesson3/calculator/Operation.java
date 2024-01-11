package Lesson3.calculator;

@FunctionalInterface
public interface Operation {

    int apply(int a, int b);
}