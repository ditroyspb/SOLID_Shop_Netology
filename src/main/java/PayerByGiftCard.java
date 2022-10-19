public class PayerByGiftCard extends Payer {
    @Override
    public void payBasket(int amount) {
        System.out.println("Сумма к оплате: " + amount + " р.");
        System.out.println("Для оплаты введите номер карты (8 цифр без пробелов)");
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 8) {
                System.out.println("Спасибо за покупку! До свидания!");
                break;
            } else {
                System.out.println("Некорректный номер подарочной карты. Попробуйте ввести еще раз");
            }
        }
    }
}
