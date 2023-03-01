package by.itacademy.valerymihailuk.javabasics;

import java.util.Scanner;

public class TenNews {
    public static void main(String[] args) {
        System.out.println("Введите количество новостей");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        int filledSheets = (int) Math.ceil(inputNumber / 10);
        int notFilledSheets = inputNumber - (filledSheets * 10);
        if (notFilledSheets > 0) {
            int allSheets = filledSheets + 1;
            System.out.println("Необходимо " + allSheets + " стр.");
            System.out.println("Внимание!!! Одна страница неполная.");
        }
        if (notFilledSheets == 0) {
            System.out.println("Необходимо " + filledSheets + " стр.");
        }
    }
}