package Geekbrains.lesson_7.homework;

import java.util.Scanner;

/**Сила тяжести на Луне примерно равна 17%, напишите программу, которая вычисляет ваш вес на Луне.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
         a = (a*100-17*a)/100;
 System.out.print(a);
    }
}
