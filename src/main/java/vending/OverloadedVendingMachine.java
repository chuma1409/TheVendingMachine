package vending;
import vending.product.*;

public class OverloadedVendingMachine {
    private int softDrinkQty;
    private  int saltySnacksQty;
     private int chocolatesQty;
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }
    public void addStock(SoftDrink softDrink){
            softDrinkQty +=1;
    }
//    public void addStock(SaltySnack saltySnack){
//            saltySnacksQty +=1;
//    }
//  public void addStock(Chocolate chocolate){
//        chocolatesQty +=1;
//    }
    public void addStock(Product product){
        softDrinkQty +=3;
        saltySnacksQty +=3;
        chocolatesQty +=3;
    }
   public void buy(Products products){
        this.softDrinkQty -=1;

        System.out.println("buy 1 SoftDrink");
    }
//   public void buy(SaltySnack saltySnack){
//        saltySnacksQty -=1;
//        System.out.println("buy 1 saltySnack");
//    }
//   public void buy(Chocolate chocolate){
//        chocolatesQty -=1;
//        System.out.println("buy 1 Chocolate");
//    }
//   public void buy(Product product){
//        softDrinkQty -=1;
//        saltySnacksQty -=1;
//        chocolatesQty -=1;
//        System.out.println("buy 3 products");
//    }
 public int buy (Products products, int x){
     return this.softDrinkQty - x;
 }
}
