/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offline1;

import java.util.Scanner;

interface CoffeeIngredients{
    void caffein(); 
     void milk();
     void sugar();
}
class CoffeeA implements CoffeeIngredients{

    @Override
    public void caffein() {
        System.out.println("Caffein for Coffee A");
    }

    @Override
    public void milk() {
        System.out.println("Milk for Coffee A");
    }

    @Override
    public void sugar() {
        System.out.println("Sugar for Coffee A");
    }
    
}
class CoffeeB implements CoffeeIngredients{

    @Override
    public void caffein() {
            System.out.println("Caffein for Coffee B");

    }

    @Override
    public void milk() {
                System.out.println("Milk for Coffee B");

    }

    @Override
    public void sugar() {
        System.out.println("No sugar : It's only for Diabetic People");
    }
    
}
class CoffeeC implements CoffeeIngredients{

    @Override
    public void caffein() {
      System.out.println("Caffein for Coffee C");

    }

    @Override
    public void milk() {
      System.out.println("Milk for Coffee C");

    }

    @Override
    public void sugar() {
        System.out.println("Sugar for Coffee C");
    }
    
}
class CoffeeFactory
{
  //String Coffee_type;  
private static CoffeeFactory coffeemaker;
//We make the constructor private to prevent the use of "new"
private CoffeeFactory() { }

public static CoffeeFactory getCoffeeMaker()
{
// Lazy initialization
if (coffeemaker == null)
{ coffeemaker = new CoffeeFactory();
System.out.println("New coffeemaker has been created");
}
    return coffeemaker;
}

public CoffeeIngredients produceCoffee(String coffeetype ){
    if(coffeetype==null){
        return null;
    }
    else if(coffeetype.equalsIgnoreCase("Coffee A")){
        return new CoffeeA();
    }
    else if(coffeetype.equalsIgnoreCase("Coffee B")){
        return new CoffeeB();
    }
    else if(coffeetype.equalsIgnoreCase("Coffee C")){
        return new CoffeeC();
    }
    return null;

}
}


public class CoffeeSupplier {
     public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
       String s=input.nextLine();
         CoffeeFactory coffeemake = CoffeeFactory.getCoffeeMaker();
         CoffeeIngredients coffee=coffeemake.produceCoffee(s);
         coffee.caffein();
         coffee.milk();
         coffee.sugar();
    
     }
}
