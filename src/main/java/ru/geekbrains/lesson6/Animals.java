package ru.geekbrains.lesson6;


public class Animals {

    public int Run (int LongRun) {
            return LongRun;
    }
    public int Swim (int LongSwim) {
            return LongSwim;
    }
    public double Jump (double HeightJump) {
        return HeightJump;
    }


}

class Cat extends Animals {
        static void CatSettings () {
            Animals Cat = new Animals();
            System.out.print("Кошка пробежала" + " " + Cat.Run(200) + " "+ "Проплыла" + " "+ Cat.Swim(0)+" " + "Подпрыгнула" +" "+ (int)Cat.Jump(2));
        }

}

class Dog extends Animals {
    static void DogSettings () {
        Animals Dog = new Animals();
            System.out.print("Собака пробежала" + " " + Dog.Run(500) + " " + "Проплыла" + " " + Dog.Swim(20) + " " + "Подпрыгнула" + " " + Dog.Jump(0.5));
        Animals Dog2 = new Animals();
        System.out.println();
        System.out.print("Собака №2 пробежала" + " " + Dog.Run(600) + " " + "Проплыла" + " " + Dog.Swim(20) + " " + "Подпрыгнула" + " " + Dog.Jump(0.5));

    }
}
class AnimalsApp {
    public static void main(String[] args) {
        Dog.DogSettings();
        System.out.println();
        Cat.CatSettings();

    }
}

//





