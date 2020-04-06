package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Cat {
        private String name;
        private int appetite;
        private boolean CatFull;

        public  Cat (String name,int appetite) {
            this.name = name;
            this.appetite = appetite;
        }

        int getAppetite () {
            return  appetite;
        }

        void setCatFull (boolean CatFull) {
            this.CatFull = CatFull;
            if (CatFull == true) {
                System.out.println("Кот сытый");
            } else {
                System.out.println("Пока миска не полная кот есть не будет");
            }
        }


    }

    class Plate {
        private int food;

        public Plate (int food) {
            this.food = food;
        }

        public int getInputFood () {
            Scanner scanner = new Scanner(System.in);
            this.food = scanner.nextInt();
            return food;

        }



        int getFood () {
            return food;
        }

        public void InfoPlate () {
            System.out.println("Еды в тарелке не достаточно");
        }
    }

    class Main {
        public static void main(String[] args) {
            Cat cat1 = new Cat("Tom", 3);
            Plate plate1 = new Plate(2);
            int CatEat = plate1.getFood() - cat1.getAppetite();
            while (CatEat < cat1.getAppetite()) {
                if (plate1.getFood()  < cat1.getAppetite()) {
                    cat1.setCatFull(false);
                    plate1.InfoPlate();
                    System.out.println("Добавьте еды не менее" + " " + cat1.getAppetite());
                    plate1.getInputFood();
                } else {
                    System.out.println("Кот съел" + " " + cat1.getAppetite());
                    cat1.setCatFull(true);
                    break;
                }
            }


        }
    }


