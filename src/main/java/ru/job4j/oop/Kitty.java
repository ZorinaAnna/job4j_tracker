package ru.job4j.oop;

public class Kitty {

    private String food; /* Поле для хранения информации о еде */
    private String name; /* Поле для хранения клички котика */

    public void giveNick(String nick) { /* Метод для выдачи клички котика */
        this.name = nick; /* Записываем переданную кличку в поле name */
    }

    public void show() { /* Метод для показа информации о котике */
        System.out.println(this.name + " ate " + this.food); /* Выводим кличку и информацию о еде */
    }

    public void eat(String meat) { /* Метод для кормления котика */
        this.food = meat; /* Записываем в поле food значение переменной meat */
    }

    public static void main(String[] args) { /* Создаём первого котика */
        System.out.println("There is Gav's food.");
        Kitty gav = new Kitty();
        gav.giveNick("Gav"); /* Назначаем кличку котику */
        gav.eat("cutlet"); /* Кормим котика */
        gav.show(); /* Показываем информацию о котике */

        System.out.println("There is Black's food."); /* Создаём второго котика */
        Kitty black = new Kitty();
        black.giveNick("Black"); /* Назначаем кличку котику */
        black.eat("fish"); /* Кормим котика */
        black.show(); /* Показываем информацию о котике */
    }
}