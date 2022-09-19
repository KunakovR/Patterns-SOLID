public abstract class Product implements InStock, Sell{

    //Open Closed Principle - добавляем классу функциональности, через InStock, Sell
    //Interface Segregation Principle - вместо одного гигантского интерфейса есть несколько различных логически независимых.

    private String name;
    private String country;
    private int price;
    private int count;
    private int weight;
    private long serialNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean inStock(int count) {
        if (count > 0) {
            System.out.println("В наличии");
            return true;
        }
        System.out.println("Нет в наличии");
        return false;
    }

    @Override
    public void sell(int count, int countSell) {
        int result = count - countSell;
        setCount(result);
    }


}
