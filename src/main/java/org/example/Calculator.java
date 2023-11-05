package org.example;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        return (T) Float.valueOf(a.floatValue() + b.floatValue());
    }

    public static <T extends Number> T substract(T a, T b) {
        return (T) Float.valueOf(a.floatValue() - b.floatValue());
    }

    public static <T extends Number> T multiply(T a, T b) {
        return (T) Float.valueOf(a.floatValue() * b.floatValue());
    }

    public static <T extends Number> T devide(T a, T b) {
        return (T) Float.valueOf(a.floatValue() / b.floatValue());
    }

}
