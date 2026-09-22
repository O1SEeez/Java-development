import java.util.Locale;

/** Демонстрация переменных и операций в Java. */
public class VariablesDemo {
    public static void main(String[] args) {
        // 1. Объявление и инициализация переменных.
        int age = 20;
        double height = 1.82;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Олег";

        System.out.println("1. Переменные разных типов");
        System.out.println("age (int) = " + age);
        System.out.printf(Locale.ROOT, "height (double) = %.2f%n", height);
        System.out.println("grade (char) = " + grade);
        System.out.println("isStudent (boolean) = " + isStudent);
        System.out.println("name (String) = " + name);

        // 2. Арифметические операции с целыми числами.
        int a = 15;
        int b = 4;
        System.out.println("\n2. Арифметические операции (a = 15, b = 4)");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 3. Логические операции.
        boolean x = true;
        boolean y = false;
        System.out.println("\n3. Логические операции (x = true, y = false)");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + !x);
        System.out.println("!y = " + !y);

        // 4. Объединение строк.
        System.out.println("\n4. Работа со строками");
        System.out.println("Привет, " + name + "! Тебе " + age + " лет.");
    }
}
