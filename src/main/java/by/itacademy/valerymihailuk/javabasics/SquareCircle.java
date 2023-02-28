package by.itacademy.valerymihailuk.javabasics;

import java.util.Scanner;

public class SquareCircle {
    public static void main(String[] args) {
        double squareCircle;
        double radius;
        System.out.println("Введите радиус");
        Scanner input = new Scanner(System.in);
        radius = input.nextDouble();
        if (radius > 0) {
            squareCircle =Math.PI*(radius*radius);
            System.out.println("Площадь круга равна "+squareCircle);
        }
        else {
            System.out.println("Введите число больше 0");
        }
    }
}
