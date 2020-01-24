package ru.javacourse;

import java.io.IOException;
import java.util.Scanner;

public class TaskT01N08 {
    public static void printValue(){
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        System.out.println("Ваше число: " + value);
    }

}

