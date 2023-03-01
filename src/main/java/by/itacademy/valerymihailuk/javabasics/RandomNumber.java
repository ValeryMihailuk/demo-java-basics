package by.itacademy.valerymihailuk.javabasics;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int x;
        int inputNumber;
        System.out.println("Введите целое число  в диапозоне от 1 до 10");
        Scanner input = new Scanner(System.in);
        inputNumber = input.nextInt();
        x = (int) Math.pow(10, inputNumber);
        Random generator = new Random();
        long randomNumber = generator.nextInt(x);
        System.out.println(randomNumber);

    }
}
