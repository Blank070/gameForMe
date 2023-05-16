import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // Загадываем число от 1 до 100
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("Угадайте число от 1 до 100.");

        do {
            System.out.print("Введите ваше предположение: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Загаданное число больше вашего.");
            } else if (guess > secretNumber) {
                System.out.println("Загаданное число меньше вашего.");
            } else {
                System.out.println("Поздравляем! Вы угадали число за " + attempts + " попыток!");
            }
        } while (guess != secretNumber);
    }
}
