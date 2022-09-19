public class Smartphone extends Product {

    private String name;
    private String country;
    private int price;
    private int count;
    private long serialNumber;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public long getSerialNumber() {
        return serialNumber;
    }

    @Override
    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
