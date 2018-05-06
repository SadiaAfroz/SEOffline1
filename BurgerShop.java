

package offline1;

import java.util.Scanner;

interface Ingredients{
    void patty(); 
     void sauce();
     void cheese();
     Burger getBurger();
}

class ChickenBurger implements Ingredients{
     private Burger cb=new Burger();
    @Override
    public void patty() {
       cb.addpatty("Patty for Chicken Burger");
                
    }

    @Override
    public void sauce() {
         cb.addsauce("Sauce for Chicken Burger");
    }

    @Override
    public void cheese() {
         cb.addcheese("Cheese for Chicken Burger");
    }

    @Override
    public Burger getBurger() {
        return cb;
    }
   

}
class BeefBurger implements Ingredients{
        
     private Burger bb=new Burger();
    @Override
    public void patty() {
        bb.addpatty("Patty for Beef Burger");
                
    }

    @Override
    public void sauce() {
        bb.addsauce("Sauce for Beef Burger");
    }

    @Override
    public void cheese() {
         bb.addcheese("Cheese for Beef Burger");
    }
 

    @Override
    public Burger getBurger() {
         return bb;
    }

}

class Burger{
    String patty;
    String sauce;
    String cheese;
   
    public void addpatty(String s){
        patty=s;
    }
    public void addsauce(String s){
        sauce=s;
    }
     public void addcheese(String s){
        cheese=s;
    }
     public void show(){
         System.out.println("Patty :"+patty+"\n"+"Sauce :"+sauce+"\n"+"Cheese :"+cheese+"\n");
     }
}

class Waiter{
    Ingredients ingredients;
    
    
    public void constructBurger(Ingredients in){
        ingredients=in;
        in.patty();
        in.cheese();
        in.sauce();
    }
}
public class BurgerShop {
    
       public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
            Waiter waiter=new Waiter();
            String s=input.next();
         
            Ingredients ingredients = null;
            if(s.equalsIgnoreCase("BeefBurger")){
                ingredients=new BeefBurger();
            }
            else if(s.equalsIgnoreCase("ChickenBurger")){
                ingredients=new ChickenBurger();
            }
            waiter.constructBurger(ingredients);
            Burger burger=ingredients.getBurger();

            burger.show();
            
    }
    
}
