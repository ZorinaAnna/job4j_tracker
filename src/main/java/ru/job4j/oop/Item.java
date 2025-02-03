package ru.job4j.oop;

public class Item {
    private int id;
    private String name;

    /* Конструктор по умолчанию */
    public Item() {
    }

    /* Конструктор с параметром String name */
    public Item(String name) {
        this.id = 0; /* Инициализация id по умолчанию */
        this.name = name; /* Инициализация name */
    }

    /* Конструктор с параметрами int id и String name */
    public Item(int id, String name) {
        this.id = id; /* Инициализация id */
        this.name = name; /* Инициализация name */
    }

    /* Метод для вывода информации о элементе */
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Название: " + name);
        System.out.println();
    }

    public static void main(String[] args) {
        /* Создаем объект с использованием конструктора по умолчанию */
        Item first = new Item();
        first.printInfo();

        /* Создаем объект с использованием конструктора с параметром String name */
        Item second = new Item("Элемент 1");
        second.printInfo();

        /* Создаем объект с использованием конструктора с параметрами int id и String name */
        Item third = new Item(1, "Элемент 2");
        third.printInfo();
    }
}