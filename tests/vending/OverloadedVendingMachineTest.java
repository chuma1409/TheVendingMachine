package vending;

import org.junit.jupiter.api.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

//import static org.junit.Assert.*;
public class OverloadedVendingMachineTest {
    @Test
    public void shouldGetStockChocolate(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Chocolate cc = new Chocolate();
        ov.getStock(cc);
        System.out.println(ov.getStock(cc));

    }
    @Test
    public void shouldGetStockAllProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        ov.getStock();
        System.out.println(ov.getStock());
    }
    @Test
    public void shouldAddStockSaltySnack(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        SaltySnack ss = new SaltySnack();
        ov.addStock(ss);
        System.out.println(ov.getStock(ss));
    }
    @Test
    public void shouldBuySoftDrink(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        SoftDrink sd = new SoftDrink();
        ov.buy(sd);
        System.out.println(ov.getStock(sd));
    }
    @Test
    public void shouldAddStockToProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Product p = new Product();
        ov.addStock(p);
        System.out.println(ov.getStock());
    }
    @Test
    public void shouldBuyAllProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Product p = new Product();
        ov.buy(p);
        System.out.println(ov.getStock());
    }
    @Test
    public void shouldBuyProductWithSpecInt(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Products c = Products.Chocolate;
        Products ss = Products.SaltySnack;
        SaltySnack s = new SaltySnack();
       ov.buy(ss,5);
        System.out.println(ov.getStock(s));
    }
    @Test
    public void shouldAddStockForSpecificAmountAndProduct(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Products pc = Products.Chocolate;
        Chocolate c = new Chocolate();
        ov.addStock(pc,7);
        System.out.println(ov.getStock(c));

    }
}
