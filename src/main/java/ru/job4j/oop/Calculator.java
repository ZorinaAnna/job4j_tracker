package ru.job4j.oop;

public class Calculator {
    private int x; /* Поле x */

    public Calculator(int x) {
        this.x = x; /* Инициализация поля x через конструктор x */
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b; /* Статический метод для вычитания x */
    }

    public int divide(int a) {
        return a / x; /* Нестатический метод для деления x */
    }

    public int sumAllOperation(int a) {
        return plus(a, x) + (x * a) + minus(x, a) + divide(a); /* Нестатический метод для суммирования всех операций */
    }

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        /* Демонстрация статических методов */
        System.out.println(plus(100, 500));
        System.out.println(minus(5, 2));

        /* Создание экземпляра класса Calculator с полем x равным 2 */
        Calculator calculator = new Calculator(two);

        /* Демонстрация нестатических методов */
        System.out.println(calculator.divide(six));
        System.out.println(calculator.sumAllOperation(four)); /* Сумма всех операций с полем x равным 2 */
    }
}