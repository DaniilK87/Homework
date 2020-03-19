package ru.geekbrains.lesson2;

import java.lang.reflect.Array;

public class TwoApp {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
            System.out.println("Первое задание");
        ArrayEight();
        ArraySix();
        ArrayTable();
        MaxMinArray();
    }
    public static int ArrayEight() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
            System.out.println("Второе задание");
            return arr.length;

    }

    public static int ArraySix() {
        int [] Arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < Arr.length; i++) {
                if (Arr[i] < 6) {
                Arr[i] = Arr[i] * 2;
                } else {
                Arr[i] = Arr[i];
                }
                System.out.print(Arr[i] + " ");
            }
            System.out.println("Третье задание");
            return Arr.length;
        }

    public static int ArrayTable() {
        int [][] arr = new int[4][4];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                    if ((i + j) % 2 == 0) {
                        arr[i][j] = 1;
                    } else  {
                        arr[i][j] = 0;

                    }
                System.out.print(arr[i][j] + " ");

            }
            System.out.println("Четвертое задание");
        }
        return arr.length;

    }
    public static int MaxMinArray() {
        int [] arr = {5,7,2,3,7};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] <  arr.length - 1) {
                System.out.println("Минимум" + arr[i]);
                break;

            }
            System.out.println();

            }
        return arr.length;
        }

    }

