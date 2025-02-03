package ru.job4j.oop;

public class Computer {

    private boolean multiMonitor;
    private int ssd;
    private String cpu;

    /* Конструктор по умолчанию */
    public Computer() {
    }

    /* Конструктор с параметрами */
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /* Конструктор с другим порядком параметров */
    public Computer(int ssd, String cpu, boolean multiMonitor) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    /* Конструктор с параметром типа double для SSD */
    public Computer(boolean multiMonitor, double ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = (int) ssd; /* Приведение типа */
        this.cpu = cpu;
    }

    /* Метод для вывода информации о компьютере */
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
        System.out.println();
    }

    public static void main(String[] args) {
        /* Создаем объект с использованием конструктора по умолчанию */
        Computer first = new Computer();
        first.printInfo();

        /* Создаем объект с использованием конструктора с параметрами */
        Computer second = new Computer(true, 500, "Intel Core I7-10700K");
        second.printInfo();

        /* Создаем объект с другим порядком параметров */
        Computer third = new Computer(256, "AMD Ryzen 5 3600", false);
        third.printInfo();

        /* Создаем объект с использованием конструктора с типом double для SSD */
        Computer fourth = new Computer(true, 512.5, "Intel Core I9-10900K");
        fourth.printInfo();
    }
}