package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class GameXO {

    public static int TabSize = 3;
    public static char[][] tab;
    public static int PointsToWin = 3;
    public static final char Cross = 'X';
    public static final char Zero = 'O';
    public static final char Empty = '-';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) { // основной игровой цикл
        initTab();
        PrintTab();
        while (true) {
            UserStep();
            PrintTab();
            if (checkWin0(Cross)) {
                System.out.println("Победил игрок");
                break;
            }
            if (DrawGame()) {
                System.out.println("Ничья");
                break;
            }
            ComputerStep();
            PrintTab();
            if (checkWin0(Zero)) {
                System.out.println("Победил компьютер");
                break;
            }
            if (DrawGame()) {
                System.out.println("Ничья");
                break;

            }

        }
        System.out.println("Game over");
    }

    public static void initTab() {        //обозначение поля
        tab = new char[TabSize][TabSize];
        for (int i = 0; i < TabSize; i++) {
            for (int j = 0; j < TabSize; j++) {
                tab[i][j] = Empty;
            }
        }
    }

    public static void PrintTab() {     // вывод поля в консоль
        for (int i = 0; i < TabSize; i++) {
            System.out.print("  "+ i);
        }
        System.out.println();
        for (int i = 0; i < TabSize; i++) {
            System.out.print(i  + " ");
            for (int j = 0; j < TabSize; j++) {
                System.out.print(tab[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void UserStep() {       // ход игрока
        int x, y;
        do {
            System.out.println("Введите координаты");
            x = sc.nextInt();
            y = sc.nextInt();
        } while (!isCellValid(x, y));
        tab[y][x] = Cross;

    }

    public static void ComputerStep() {      //ход компьютера
        int x, y;
        do {
            x = rand.nextInt(TabSize);
            y = rand.nextInt(TabSize);
        } while (isCellValid2(x, y));
        System.out.println("Ход компьютера"+ " " + x + y);
        tab[x][y] = Zero;

    }

    public static boolean isCellValid(int x, int y) {   // проверка ячейки при ходе игрока
        if (x < 0 || x >= TabSize || y < 0 || y >= TabSize) return false;
        if (tab[x][y] == Empty) return true;
        return false;
    }

    public static boolean isCellValid2(int x, int y) {  // проверка ячейки при ходе компьютера
        if (x < 0 || x >= TabSize || y < 0 || y >= TabSize) return false;
        if (tab[x][y] == Empty & tab[x][y] == Cross) return true;
        return false;
    }

    public static boolean checkWin0(char symb) {   //условие победы
        for (int i = 0; i <TabSize ; i++) {
            for (int j = 0; j < TabSize ; j++) {
                if (tab[i][0] == symb && tab[i][1] == symb && tab[i][2] == symb) return true;
                if (tab[0][j] == symb && tab[1][j] == symb && tab[2][j] == symb) return true;
                if (tab[0][0] == symb && tab[1][1] == symb && tab[2][2] == symb) return true;

            }

        }
        return false;
    }


    public static boolean DrawGame () {      // условие при которой ничья
        for (int i = 0; i < TabSize ; i++) {
            for (int j = 0; j < TabSize ; j++) {
                if (tab[i][j] == Empty) return false;

            }

        }
        return true;
    }
}
