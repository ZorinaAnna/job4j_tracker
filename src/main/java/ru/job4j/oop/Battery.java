package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {

        int currentLoad = this.load; /* Сохраняем текущий заряд */

        another.load += currentLoad; /* Добавляем заряд к другой */

        if (another.load > 100) {
            another.load = 100; /* Устанавливаем максимум */
        }

        this.load = 0; /* Устанавливаем заряд текущей батареи в 0 */
    }

    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);

        System.out.println("Before exchange:");
        System.out.println("First: " + first.about());
        System.out.println("Second: " + second.about());

        first.exchange(second); /* Вызываем метод exchange у первой батареи */

        System.out.println("After exchange:");
        System.out.println("First: " + first.about());
        System.out.println("Second: " + second.about());
    }
}