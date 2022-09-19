public class Iphone extends Smartphone {

    //Liskov substitution principle - наследник класса Product->Smartphone
    //Single Responsibility Principle - класс Iphone описывает только себя

    private final String name = "Iphone14";
    private final String country = "USA";
    private int price;
    private int count;
    private long serialNumber;

    public Iphone(int price, int count) {
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
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
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
    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", изготовлено в '" + country + '\'' +
                ", цена = " + price +
                ", имеется в наличии = " + count +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
