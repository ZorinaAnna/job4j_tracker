package ru.job4j.oop;

public class Hare {
    public void tryEat(Ball kolobok) {
        System.out.println("Заяц пытается съесть колобка...");
        kolobok.tryRun(false);
    }
}