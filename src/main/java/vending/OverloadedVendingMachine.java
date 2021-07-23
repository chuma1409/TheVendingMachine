package vending;
import vending.product.*;

public class OverloadedVendingMachine {
    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;
    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        // set the stockLevel instance variables for each product in the constructor
        this.softDrinkQty = softDrinkQty;
        this.saltySnacksQty = saltySnacksQty;
        this.chocolatesQty = chocolatesQty;
    }

    public void addStock(SoftDrink softDrink){
        this.softDrinkQty +=1;
    }
    public void addStock(SaltySnack saltySnack){
        this.saltySnacksQty +=1;
    }
    public void addStock(Chocolate chocolate){
        this.chocolatesQty +=1;
    }
    public int getStock(SoftDrink softdrink){
        return softDrinkQty;
    }

    int getStock(SaltySnack saltySnack){
        return saltySnacksQty;
    }

    int getStock(Chocolate chocolate){
        return chocolatesQty;
    }

    public void addStock(Product product){
       this.softDrinkQty +=3;
        this.saltySnacksQty +=3;
        this.chocolatesQty +=3;
    }
    public void buy(SaltySnack saltySnack){
        this.saltySnacksQty -=1;
        System.out.println("buy 1 saltySnack");
    }
    public void buy(Chocolate chocolate){
        this.chocolatesQty -=1;
        System.out.println("buy 1 Chocolate");
    }
    public void buy(SoftDrink softDrink){
        this.softDrinkQty -=1;
        System.out.println("buy 1 SoftDrink");
        System.out.println(softDrinkQty);
    }
    public int getStock(){
        int x = this.softDrinkQty+this.saltySnacksQty+this.chocolatesQty;
        return x;
    }


   public void buy(Product product){
        this.softDrinkQty -=1;
        this.saltySnacksQty -=1;
        this.chocolatesQty -=1;
        System.out.println("buy 3 products");
    }
// public int buy (Products products, int x){
//     return this.softDrinkQty - x;
// }
}
