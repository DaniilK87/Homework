package ru.geekbrains.lesson5;



public class PersonApp {


    public  static void main(String[] args) {
        Person [] array = new Person[5];
        array [0] = new Person("Ivan E", "sales manager", "ivan@mail.ru", 89261445, 30000, 25);
        array [1] = new Person("Petr S", "sales manager", "petr@mail.ru", 89261446, 25000, 23);
        array [2] = new Person("Oleg T", "sales manager", "oleg@mail.ru", 89261447, 30000, 26);
        array [3] = new Person("Alexander V", "sales director", "alex@mail.ru", 89261444, 60000, 42);
        array [4] = new Person("Vladislav D", "operating director", "vlad@mail.ru", 89261555, 80000, 49);
        Person person1 = array[0];
        Person person2 = array[1];
        Person person3 = array[2];
        Person person4 = array[3];
        Person person5 = array[4];
        for (int i = 0; i < array.length ; i++) {
            if (i == 3) {
                System.out.println(person4);
        } else if (i == 4) {
                System.out.println(person5); //
            }
        }


        }





    }

