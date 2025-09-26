package OOPs.Abstraction;



/*Abstraction in Java is the process of hiding internal implementation details
 and showing only essential functionality to the user. It focuses on what an object does rather than how it does it. */


 /*It is not necessory that a abstract class will have abstract methods but if the method is abstract its class will be declared as abstract */
 abstract class  Laptop{
      
    public abstract void internalStorage();
    public abstract void graphicsCard();

    public void turnOnLaptop(){
        System.out.println("laptop is onn...");
    }
}

abstract class Features extends Laptop{

    

    public void internalStorage(){
        System.out.println("8GB RAM");
    }
}


class AdvanceFeature extends Features{
     public void graphicsCard(){
        System.out.println("Nvidia graphics card");
     }
}

//We can not create the object of an abstract class, if we want , first we need to extend that class into another class and then make object of that class


public class Demo {
      public static void main(String[] args) {
        // Features obj=new Features();
        AdvanceFeature obj=new AdvanceFeature();
        obj.turnOnLaptop();
        obj.internalStorage();
        obj.graphicsCard();
      }
}
