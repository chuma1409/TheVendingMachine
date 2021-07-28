
import vending.ExtendableVendingMachine;
import vending.product.*;
import vending.OverloadedVendingMachine;


public class Main {
    public static void main(String[] args) {
        // OverloadedVendingMachine ov = new OverloadedVendingMachine(5,5,5);

        OverloadedVendingMachine ov = new OverloadedVendingMachine(6, 5, 5);
        ov.getStock();
        SoftDrink sd = new SoftDrink();
        SaltySnack ss = new SaltySnack();
        Chocolate cc = new Chocolate();
        Product pp = new Product();
        ov.buy(sd);
        //ov.buy(pp);
        ov.buy(cc);
       // ov.addStock(cc);
        ov.addStock(pp);
       // System.out.println(sd.description());
        //System.out.println(ov.getStock(sd));
        //System.out.println(ov.getStock());
        ExtendableVendingMachine em = new ExtendableVendingMachine(3,3,3,4);
        Chocolate cl = new Chocolate();
        SaltySnack sm = new SaltySnack();
         em.buy(sm);
         em.buy(cl);
         em.addStock(cl);
        // em.getStock(new Product());
         //em.addStock(new Product());
        em.buy(cl,3);
        em.addStock(cl,7);
        System.out.println(em.getStock());
    }
}