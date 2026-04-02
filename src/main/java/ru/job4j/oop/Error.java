package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Error defaultError = new Error();
        System.out.println("Ошибка по умолчанию:");
        defaultError.printInfo();

        Error criticalError = new Error(true, 500, "Внутренняя ошибка сервера");
        System.out.println("Критическая ошибка:");
        criticalError.printInfo();

        Error warningError = new Error(false, 404, "Ресурс не найден");
        System.out.println("Предупреждение:");
        warningError.printInfo();

        Error authError = new Error(true, 401, "Ошибка авторизации");
        System.out.println("Ошибка авторизации:");
        authError.printInfo();
    }
}