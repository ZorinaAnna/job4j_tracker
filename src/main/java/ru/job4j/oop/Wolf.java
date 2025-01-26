package ru.job4j.oop;

public class Wolf {
    public void tryEat(Ball kolobok) {
        System.out.println("Волк пытается съесть колобка...");
        kolobok.tryRun(false);
    }
}