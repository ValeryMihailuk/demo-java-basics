package by.itacademy.valerymihailuk.javabasics;

import java.util.Scanner;

public class FlexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputNumber1 = input.nextInt();
        String inputSign = input.next();
        int inputNumber2 = input.nextInt();
        switch (inputSign) {
            case ("*"):
                int multiplication = inputNumber1 * inputNumber2;
                System.out.println("Ответ: " + multiplication);
                break;
            case ("/"):
                int division = inputNumber1 / inputNumber2;
                System.out.println("Ответ:" + division);
                break;
            case ("+"):
                int sum = inputNumber1 + inputNumber2;
                System.out.println("Ответ:" + sum);
                break;
            case ("-"):
                int subtraction = inputNumber1 - inputNumber2;
                System.out.println("Ответ:" + subtraction);
                break;
            case ("%"):
                int remainderDivision = inputNumber1 % inputNumber2;
                System.out.println("Ответ:" + remainderDivision);
                break;
            default:
                System.out.println("!!!Неверный знак!!!");
                break;
        }
    }
}
