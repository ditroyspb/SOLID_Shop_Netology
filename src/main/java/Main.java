import java.util.*;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        Payer payer = new Payer();
        Payer payerByGiftCard = new PayerByGiftCard();

        Food bread = new Food("bread", 300, 50, 265);
        Food pasta = new Food("pasta", 500, 150, 400);
        Food juice = new Food("juice", 900, 170, 450);
        Food meat = new Food("meat", 1000, 370, 600);
        Food chips = new Food("chips", 200, 160, 180);
        Alcohol whiskey = new Alcohol("whiskey", 45, 1000, 700);
        Alcohol beer = new Alcohol("beer", 6, 500, 50);
        Alcohol wine = new Alcohol("wine", 12, 750, 800);
        Alcohol rum = new Alcohol("rum", 49, 500, 1100);
        Alcohol cognac = new Alcohol("cognac", 43, 500, 900);
        Toys car = new Toys("car", "plastic", 1100, "China");
        Toys superman = new Toys("superman", "plastic", 1900, "Japan");
        Toys motorcycle = new Toys("motorcycle", "plastic", 2100, "USA");
        Toys soldier = new Toys("soldier", "metal", 900, "Russia");
        Toys tractor = new Toys("tractor", "plastic", 600, "Russia");
        List<Product> productList = Arrays.asList(bread, pasta, juice, meat, chips, whiskey, beer, wine,
                rum, cognac, car, superman, motorcycle, soldier, tractor);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в наш онлайн-магазин. \n");
        while (true) {
            System.out.println(
                    "Если хотите посмотреть список товаров, введите list. \nЕсли хотите добавить товар в корзину, введите " +
                            "имя товара и количество через пробел.\nЧтобы получить информацию по товару, введите info.\nЧтобы посмотреть список добавленных в корзину товаров, введите " +
                            "basket. \nЧтобы оплатить покупки картой Мир, MasterCard или Visa, введите pay. \nЧтобы оплатить покупки подарочной картой, введите payCard. " +
                            "\nЕсли вы хотите выйти из магазина, введите end.");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Спасибо за использование нашего магазина!");
                break;
            } else if (input.equals("list")) {
                System.out.println(productList);
            } else if (input.equals("basket")) {
                basket.printBasket();
            } else if (input.equals("pay")) {
                payer.payBasket(basket.calculateBasket());
                break;
            } else if (input.equals("info")) {
                System.out.println("Введите название товара:");
                String inputProduct = scanner.nextLine();
                for (Product product : productList) {
                    if (inputProduct.equals(product.getName())) {
                        product.printInfo();
                        break;
                    }
                }
            } else if (input.equals("payCard")) {
                payerByGiftCard.payBasket(basket.calculateBasket());
                break;
            } else {
                String[] parts = input.split(" ");
                int count = Integer.parseInt(parts[1]);
                for (Product product : productList) {
                    String[] partsProduct = product.toString().split(" ");
                    if (partsProduct[0].equals(parts[0])) {
                        basket.addProductToBasket(product, count);
                        break;
                    }
                }
            }
        }
    }
}
