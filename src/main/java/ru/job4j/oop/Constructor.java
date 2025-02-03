package ru.job4j.oop;

public class Constructor {

    private boolean multiMonitor; /* Поле=Атрибут */
    private int ssd; /* Поле=Атрибут */
    private String cpu; /* Поле=Атрибут */


    public Constructor(boolean multiMonitor, int ssd, String cpu) { /* Конструктор инициализирует поля класса значениями */
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }

    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }

    public static void main(String[] args) {
        Constructor comp = new Constructor(true, 256, "AMD Ryzen 5 3600");
        comp.printInfo();
    }
}