package ru.geekbrains.lesson1;

import java.util.Scanner;

public class FirstApp {
    public static void main(String[] args) {
        String message = "Hello";
        char symbol = 'i';
        int x = 2020;
        float p = 3.14f;
        long z = 5600L;
        boolean result = true;
                System.out.println(message);
                System.out.println(symbol);
                System.out.println(x);
                System.out.println(p);
                System.out.println(z);
                System.out.println(result);
     ExpressionResult(); // метод 2
     SumOfNumbers(); // метод 3
     PlusOrMinus(); // метод 4
     BelowZero(); // метод 5
     HelloName(); // метод 6

    }

    public static int ExpressionResult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A");
            int a = scanner.nextInt();
        System.out.println("Введите B");
            int b = scanner.nextInt();
        System.out.println("Введите C");
            int c = scanner.nextInt();
        System.out.println("Введите D");
            int d = scanner.nextInt();
                int  conclusion =  a * (b + (c / d));
        System.out.println("Результат a * (b + (c / d)=" +  conclusion);
                return  conclusion;

    }

    public static boolean SumOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
            int number1 = scanner.nextInt();
        System.out.println("Введите второе число");
            int number2 = scanner.nextInt();
                int sum = number1 + number2;
                    if (sum < 10 || sum > 20) {
                        System.out.println("Данная сумма не принадлежит к диапазону от 10 до 20" + "сумма чисел = " +  sum);
                        return false;
                    } else {
                        System.out.println("Данная сумма принадлежит к диапазону от 10 до 20" + "сумма чисел = " +  sum);
                        return true;
                    }
    }

    public static boolean PlusOrMinus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
            int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Число отрицательное и равно" +  number);
                    return false;
                } else {
                    System.out.println("Число положительное и равно" +  number);
                    return true;
                }
    }

    public static boolean BelowZero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
            int number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Отрицательное число");
                    return true;
                } else {
                    return false;
                }
    }

    public static void HelloName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
            String Name = scanner.next();
            System.out.println("Hello" + Name);
    }


}