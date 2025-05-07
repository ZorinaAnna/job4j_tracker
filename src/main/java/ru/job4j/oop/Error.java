public class Error {
    private boolean active;
    private int status;
    private String message;

    /* Явный конструктор по умолчанию */
    public Error() {
    }

    /* Конструктор с тремя параметрами */
    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    /* Метод для вывода содержимого полей */
    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        /* Создание объекта с помощью конструктора по умолчанию */
        Error defaultError = new Error();
        defaultError.printInfo();

        /* Создание объекта с помощью конструктора с параметрами */
        Error customError = new Error(true, 404, "Not Found");
        customError.printInfo();
    }
}