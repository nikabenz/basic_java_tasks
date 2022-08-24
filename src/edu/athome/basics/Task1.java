package edu.athome.basics;

// Найдите значение функции z = ((a - 3) * b / 2) + c
public class Task1 {
    public static void main(String[] args) {
        System.out.println("z = " + calculate(4, 4.5, 5.5));
    }

    public static double calculate(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
