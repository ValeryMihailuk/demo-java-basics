package by.itacademy.valerymihailuk.javabasics;


import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a, b, c, d1, d2, d3;
        double discriminant;
        System.out.println("Ввести данные a,b и c");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discriminant = b * b - (a * c) * 4;

        if (discriminant < 0) {
            System.out.println("!!!Warning!!!");
            System.out.println("Дискриминант отрицательный, корня нет");
        } else if (discriminant == 0) {
            d1 = -b / (a * a);
            System.out.println("Один дискриминант");
            System.out.println("Корень равен " + d1);
        } else if (discriminant > 0) {
            d2 = (-b + Math.sqrt(discriminant)) / a * a;
            d3 = (-b - Math.sqrt(discriminant)) / a * a;
            System.out.println("Два корня");
            System.out.println("Первый корень равен " + d2 + " Второй корень равен " + d3);
        }
    }
}

