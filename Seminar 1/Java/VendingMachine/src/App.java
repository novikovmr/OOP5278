import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Display;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product(100, 12, "Lays", 1234);
        Product item2 = new Product(120, 14, "Nuts", 1235);
        Product item3 = new Product(90, 16, "Choco", 1236);
        Product item4 = new Product(150, 18, "Chips", 1237);
        Product item5 = new Product(20, 1, "Snikers", 1238);
        Product item6 = new Product(60, 2, "Mars", 1239);
        Product item7 = new Bottle(75, 3, "Pepsi", 1240, 0.5f);
        Product item8 = new HotDrink(125, 4, "Coffee", 1241, 75, 0.275f, true);
        Product item9 = new HotDrink(110, 5, "Tea", 1242, 90, 0.5f, false);
        Product item10 = new HotDrink(130, 6, "Raf coffee", 1243, 80, 0.5f, true);

        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Display disp = new Display();
        List<Product> listProduct = new ArrayList<>();

        listProduct.add(item1);
        listProduct.add(item2);
        listProduct.add(item3);
        listProduct.add(item4);
        listProduct.add(item5);
        listProduct.add(item6);
        listProduct.add(item7);
        listProduct.add(item8);
        listProduct.add(item9);
        listProduct.add(item10);

        VendingMachine vm = new VendingMachine(hold, coin, disp, listProduct);

        for (Product p : vm.getAssort()) {
            System.out.println(p);
        }

    }
}
