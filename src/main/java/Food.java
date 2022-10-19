public class Food implements Product {

    private String name;
    private int weight;
    private int price;
    private int calories;

    @Override
    public String toString() {
        return name + " - " + price + " р.";
    }

    public Food(String name, int weight, int price, int calories) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public void printInfo() {
        System.out.println("Название товара: " + name + ";\nВес: " + weight + ";\nЦена: "
                + price + " р.;\nКалорийность: " + calories + "кКал/100г.");
    }

    public Food() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }
}
