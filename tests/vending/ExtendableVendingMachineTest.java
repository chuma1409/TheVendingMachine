package vending;

import org.junit.jupiter.api.Test;
import vending.product.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtendableVendingMachineTest {
    @Test
    public void shouldBuyChocolate(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        Chocolate c = new Chocolate();
        ev.buy(c);
        assertEquals(4,ev.getStock(c));
    }
    @Test
    public void shouldAddstockDrink(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        SoftDrink s = new SoftDrink();
        ev.addStock(s);
        assertEquals(8,ev.getStock(s));
    }
    @Test
    public void shouldAddSpecificProductSpecificTimes(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        SaltySnack ss = new SaltySnack();
        ev.addStock(ss,5);
        assertEquals(10,ev.getStock(ss));
    }
    @Test
    public void shouldBuySpecificProductSpecificTimes(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        Sweet sw = new Sweet();
        ev.buy(sw,4);
        assertEquals(1,ev.getStock(sw));
    }
    @Test
    public void shouldGetstockForAllProducts(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        ev.getStock();
        assertEquals(20,ev.getStock());
    }
    @Test
    public void shouldUseAllMethods(){
        ExtendableVendingMachine ev = new ExtendableVendingMachine(5,5,5,5);
        Chocolate c = new Chocolate();
        Sweet sw = new Sweet();
        SaltySnack ss = new SaltySnack();
        SoftDrink sd = new SoftDrink();
        ev.buy(ss);
        ev.addStock(sw,5);
        ev.addStock(c);
        ev.buy(sd,2);
        assertEquals(25, ev.getStock());
    }
}
