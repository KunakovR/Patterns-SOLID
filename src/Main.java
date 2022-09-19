import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Magic Numbers Principle
    private static int position = 1;

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Iphone(999, 100));
        list.add(new RedApples(5, 60));
        int[] totalCount = new int[list.size()];
        Logger welcome = new Console();
        welcome.log();
        printList(list);
        buyProducts(list, totalCount);
        printBasket(totalCount, list);


    }

    //принцип DRY - повторяющийся вывод списка продуктов
    private static void printList(List<Product> list) {
        for (int i = 0; i < list.size(); i++) {
            //Magic Numbers Principle
            System.out.println((position++) + ". " + list.get(i));
        }
        position = 1;

    }

    private static int[] buyProducts(List<Product> list, int[] totalCount) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] parts = input.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCount = Integer.parseInt(parts[1]);
            Product productSell = list.get(productNumber);
            if (productSell.getCount() < productCount) {
                System.out.println("Недостаточное количество для покупки");
            } else {
                productSell.sell(productSell.getCount(), productCount);
                list.set(productNumber, productSell);
                totalCount[productNumber] += productCount;
                printList(list);
            }
        }
        return totalCount;
    }

    private static void printBasket(int[] totalCount, List<Product> list) {
        List<Product> basket = new ArrayList<>();
        for (int i = 0; i < totalCount.length; i++) {
            Product product = list.get(i);
            product.setCount(totalCount[i]);
            basket.add(product);
        }
        System.out.println("Ваша корзина: ");
        for (Product baskets : basket) {
            System.out.println(baskets.getName() + " " + "Стоимость: " + baskets.getCount() * baskets.getPrice());
        }


    }


}



