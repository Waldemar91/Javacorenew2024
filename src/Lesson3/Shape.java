package Lesson3;

public interface Shape {

    double getArea();

    default void printArea() {
        System.out.println(getArea());
    }
}