public class RedApples extends Apple{

    private final String name = "Красные яблоки";
    private final String country = "Австралия";
    private int price;
    private int count;

    public RedApples(int price, int count) {
        this.price = price;
        this.count = count;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", изготовлено в '" + country + '\'' +
                ", цена = " + price +
                ", имеется в наличии = " + count
                ;
    }
}
