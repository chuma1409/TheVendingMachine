package vending;

import vending.product.Product;
import vending.product.*;


public class ExtendableVendingMachine {
    private int ChocQty;
   private int DrinkQty;
   private int SnackQty;
   private int SweetQty;
    public ExtendableVendingMachine(int ChocQty, int DrinkQty, int SnackQty, int SweetQty){
        this.ChocQty = ChocQty;
        this.DrinkQty = DrinkQty;
        this.SnackQty = SnackQty;
        this.SweetQty = SweetQty;
    }
    public int getStock(){
        int x = this.DrinkQty+this.SnackQty+this.ChocQty+this.SweetQty;
        return x;
    }
    public int getStock(Product product){
        int x = 0;
       if(product instanceof SaltySnack){
          x =this.SnackQty;
       }
       if(product instanceof SoftDrink){
           x=this.DrinkQty;
       }
       if(product instanceof Chocolate){
           x=this.ChocQty;
       }
        if(product instanceof Sweet){
            x=this.SweetQty;
        }
           return x;
    }
    public void addStock(Product product,int p){
        if(product instanceof SaltySnack){
            this.SnackQty +=p;
        }
        if(product instanceof SoftDrink){
            this.DrinkQty +=p;
        }
        if(product instanceof Chocolate){
            this.ChocQty +=p;
        }
        if(product instanceof Sweet){
            this.SweetQty +=p;
        }
    }

    public void buy(Product product,int b){
        if(product instanceof SaltySnack && (SnackQty>0 && SnackQty>=b)){
            this.SnackQty -=b;
        }
        if(product instanceof SoftDrink && (DrinkQty>0 && DrinkQty>=b)){
            this.DrinkQty -=b;
        }
        if(product instanceof  Chocolate && (ChocQty >0 && ChocQty>=b)){
            this.ChocQty -=b;
        }
        if(product instanceof  Sweet && (SweetQty >0 && SweetQty>=b)){
            this.SweetQty -=b;
        }
    }

    public void buy(Product product){
            if(product instanceof SaltySnack && (SnackQty>0)){
             this.SnackQty -=1;
            }
            if(product instanceof SoftDrink && (DrinkQty>0)){
                this.DrinkQty -=1;
            }
            if(product instanceof  Chocolate && (ChocQty >0)){
                this.ChocQty -=1;
            }
        if(product instanceof Sweet && (SweetQty >0)){
            this.SweetQty -=1;
        }
    }
    public void addStock(Product product){
        if(product instanceof SaltySnack){
            this.SnackQty +=3;
        }
        if(product instanceof SoftDrink){
            this.DrinkQty +=3;
        }
        if(product instanceof Chocolate){
            this.ChocQty +=3;
        }
        if(product instanceof Sweet){
            this.SweetQty +=3;
        }
    }

}
