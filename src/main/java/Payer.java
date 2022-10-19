import java.util.Scanner;

public class Payer {

    Scanner scanner = new Scanner(System.in);

    public void payBasket(int amount) {
        System.out.println("Сумма к оплате: " + amount + " р.");
        System.out.println("Для оплаты введите номер карты (16 цифр без пробелов)");
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 16) {
                System.out.println("Спасибо за покупку! До свидания!");
                break;
            } else {
                System.out.println("Некорректный номер карты. Попробуйте ввести еще раз");
            }
        }
    }
}
