package ru.job4j.oop;

public class Kitty {

    private String food; /* создали поле класса Cat, которое называется food */

    public void show() { /* метод будет выводить в консоль содержимое поля food */
        System.out.println(this.food); /* чтобы обратиться к полю объекта, this, указывает нужно вывести содержимое поля */
    }

    public static void main(String[] args) {
        System.out.println("There is gav's food.");
        Kitty gav = new Kitty();
        gav.show();
        System.out.println("There is black's food.");
        Kitty black = new Kitty();
        black.show();
    }
}