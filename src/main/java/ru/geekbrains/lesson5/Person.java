package ru.geekbrains.lesson5;

public class Person {
    private String fio;
    private String position;
    private String Email;
    private long TelNumber;
    private int WagesRub;
    private int Age;

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", position='" + position + '\'' +
                ", Email='" + Email + '\'' +
                ", TelNumber=" + TelNumber +
                ", WagesRub=" + WagesRub +
                ", Age=" + Age +
                '}';
    }

    public Person(String fio, String position, String Email, long TelNumber, int WagesRub, int Age) {
        this.fio = fio;
        this.position = position;
        this.Email = Email;
        this.TelNumber = TelNumber;
        this.WagesRub = WagesRub;
        this.Age = Age;

    }


}
