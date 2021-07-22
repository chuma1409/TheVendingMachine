import vending.Products;
import vending.product.*;
import vending.OverloadedVendingMachine;

import static vending.Products.SaltySnacks;
import static vending.Products.SoftDrink;

public class Main {
    public static void main(String[] args) {
       // OverloadedVendingMachine ov = new OverloadedVendingMachine(5,5,5);

      OverloadedVendingMachine ov = new OverloadedVendingMachine(6,5,5);
    ov.buy(SoftDrink, 2);
        System.out.println(ov.buy(SoftDrink, 2));
        System.out.println(ov.buy(SaltySnacks, 2));
    }
}
