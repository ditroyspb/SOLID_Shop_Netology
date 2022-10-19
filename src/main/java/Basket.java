import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Basket implements BasketInterface, PrinterInterface {
    protected Map<Product, Integer> productBasket = new HashMap<>();

    @Override
    public int calculateBasket() {
        int amount = 0;
        for (Map.Entry<Product, Integer> kv : productBasket.entrySet()) {
            String[] parts = kv.getKey().toString().split(" ");
            int price = Integer.parseInt(parts[2]);
            int sumProductPrice = price * kv.getValue();
            amount += sumProductPrice;
        }
        return amount;
    }

    @Override
    public void printBasket() {
        System.out.println("Ваши товары в корзине: ");
        for (Map.Entry<Product, Integer> kv : productBasket.entrySet()) {
            System.out.println(kv.getKey() + " - " + kv.getValue() + " шт.");
        }
        System.out.println("Сумма к оплате: " + calculateBasket());
    }

    public void addProductToBasket(Product product, int count) {
        for (Map.Entry<Product, Integer> kv : productBasket.entrySet()) {
            if (kv.getKey().equals(product) && kv.getValue() != 0) {
                kv.setValue(kv.getValue() + count);
                System.out.println("Товар " + product + " уже есть в корзине. Теперь его количество - " + kv.getValue() + " шт.");
                return;
            }
        }
        productBasket.put(product, count);
        System.out.println("Товар " + product + " добавлен в корзину в количестве " + count + " шт.");
    }
}
