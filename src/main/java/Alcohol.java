public class Alcohol implements Product {

    private String name;
    private int alcoholContent;
    private int volume;
    private int price;

    public Alcohol(String name, int alcoholContent, int volume, int price) {
        this.name = name;
        this.alcoholContent = alcoholContent;
        this.volume = volume;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " - " + price + " р.";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrong() {
        return alcoholContent;
    }

    public void setStrong(int alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printInfo() {
        System.out.println("Название товара: " + name + ";\nСодержание алкоголя: " + alcoholContent + " градусов;\nОбъем: "
                + volume + " мл.;\nЦена: " + price + "р.");
    }
}
