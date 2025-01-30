package ru.job4j.oop;

public class ConstructorDefault {

    private boolean multiMonitor; /* Поле=Атрибут */
    private int ssd; /* Поле=Атрибут */
    private String cpu; /* Поле=Атрибут */

    public ConstructorDefault() { /* Конструктор по умолчанию, который не принимает параметров.
    Он позволяет создать объект класса Computer без инициализации полей.
    При создании объекта с помощью этого конструктора поля будут иметь значения по умолчанию: */
    }

    public static void main(String[] args) {
        ConstructorDefault computer = new ConstructorDefault();
        computer.printInfo(); /* Метод выводит информацию о компьютере */
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }
}
