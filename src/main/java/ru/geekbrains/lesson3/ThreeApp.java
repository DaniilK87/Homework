package ru.geekbrains.lesson3;

import java.util.Scanner;

public class ThreeApp {
    public static void main(String[] args) {
        while (true) {
            FunctionNumber();
            int ExitUserNumber = 0;
            int ReturnUserNumber = 1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите повторить?");
            int EnterUserNumber = scanner.nextInt();
                if (EnterUserNumber == ExitUserNumber) {
                    break;
                } else if (EnterUserNumber == ReturnUserNumber) {
                    continue;
                    //21312313
                }
        }
    }



    public static void FunctionNumber () {
         int number = (int) (Math.random() * 10);
         int chance = 0;
            while (chance < 3) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число от 0 до 9");
                int userNumber = scanner.nextInt();
                if (number == userNumber) {
                    System.out.println("Правильно");
                    System.out.println("Игра окончена");
                    break;
                } else if (number > userNumber) {
                    System.out.println("Загаданное число больше" + " " + userNumber);
                    chance++;
                } else if (number < userNumber) {
                    System.out.println("Загаданное число меньше" + " " + userNumber);
                    chance++;
                }
            }

        }
    }

