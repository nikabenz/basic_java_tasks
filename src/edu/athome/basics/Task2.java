package edu.athome.basics;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// Вычислить значение выражения по формуле
// (все переменные принимают действительные значения):
// ((b + sqrt(b * b + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + ( 1 / (b * b)))
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("enter numbers a, b, c ( a and b not null): ");
        do {
            System.out.println(" a (not null) = ");
            a = scanner.nextDouble();
        } while (a == 0);
        do {
            System.out.println(" b (not null) = ");
            b = scanner.nextDouble();
        } while (b == 0);
        System.out.println(" c = ");
        c = scanner.nextDouble();
        if (b * b >= -4 * a * c) {
            System.out.println(" result is " + calculate(a, b, c));
        } else {
            System.out.println(" result not found ");
        }
    }

    public static double calculate(double a, double b, double c) {
        return ((b + sqrt(b * b + 4 * a * c)) / (2 * a)) - pow(a, 3) * c + pow(b, -2);
    }
}
