public class Toys implements Product {

    private String name;
    private String material;
    private int price;
    private String countryManufacturer;

    public Toys(String name, String type, int price, String countryManufacturer) {
        this.name = name;
        this.material = type;
        this.price = price;
        this.countryManufacturer = countryManufacturer;
    }

    @Override
    public void printInfo() {
        System.out.println("Название товара: " + name + ";\nМатериал: " + material + ";\nЦена: "
                + price + " р.;\nСтрана-производитель: " + countryManufacturer + ".");
    }

    @Override
    public String toString() {
        return name + " - " + price + " р.";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    public String getCountryManufacturer() {
        return countryManufacturer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.material = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCountryManufacturer(String countryManufacturer) {
        this.countryManufacturer = countryManufacturer;
    }
}
