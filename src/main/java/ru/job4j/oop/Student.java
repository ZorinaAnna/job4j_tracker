package ru.job4j.oop;

public class Student {

    public void music() {
        System.out.println("I believe I can fly");
        System.out.println("Tra tra tra");
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
    }
}