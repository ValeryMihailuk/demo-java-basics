package by.itacademy.valerymihailuk.javabasics;

import java.util.Scanner;

public class CmdHelloName {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        Scanner input = new Scanner(System.in);
        String inputName = input.next();
        System.out.println("Hello "+inputName+" !");
    }
}