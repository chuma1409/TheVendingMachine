package vending;

import org.junit.jupiter.api.Test;
import vending.product.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OverloadedVendingMachineTest {
    @Test
    public void shouldGetStockChocolate(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Chocolate cc = new Chocolate();
        ov.getStock(cc);
        assertEquals(10,ov.getStock(cc));

    }
    @Test
    public void shouldGetStockAllProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        ov.getStock();
        assertEquals(28,ov.getStock());
    }
    @Test
    public void shouldAddStockSaltySnack(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        SaltySnack ss = new SaltySnack();
        ov.addStock(ss);
        assertEquals(9,ov.getStock(ss));
    }
    @Test
    public void shouldBuySoftDrink(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        SoftDrink sd = new SoftDrink();
        ov.buy(sd);
        assertEquals(9,ov.getStock(sd));
    }
    @Test
    public void shouldAddStockToProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Product p = new Product();
        ov.addStock(p);
        assertEquals(37,ov.getStock());
    }
    @Test
    public void shouldBuyAllProducts(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Product p = new Product();
        ov.buy(p);
        assertEquals(25,ov.getStock());
    }
    @Test
    public void shouldBuyProductWithSpecInt(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Products c = Products.Chocolate;
        Products ss = Products.SaltySnack;
        SaltySnack s = new SaltySnack();
       ov.buy(ss,5);
        assertEquals(3,ov.getStock(s));
    }
    @Test
    public void shouldAddStockForSpecificAmountAndProduct(){
        OverloadedVendingMachine ov = new OverloadedVendingMachine(10,8,10);
        Products pc = Products.Chocolate;
        Chocolate c = new Chocolate();
        ov.addStock(pc,7);
        assertEquals(17,ov.getStock(c));
    }
}
