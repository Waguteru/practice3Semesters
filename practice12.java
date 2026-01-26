
import java.util.InputMismatchException;
import java.util.Scanner;

public class practice12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: "); //дописанный код
            int number = scanner.nextInt();

            int result = 100 / number;          //дописанный код
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите корректное число!");
        } catch (ArithmeticException e) {       //дописанный код
            System.out.println("Ошибка: Деление на ноль невозможно!");
        } finally {
            scanner.close();                   //дописанный код
            System.out.println("Сканнер закрыт.");
        }
    }
}
