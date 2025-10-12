package Interface;

/*abstract class A{
    public abstract void show();
}


public class Demo {
    public static void main(String[] args) {
       A obj=new A(){
          public void show(){
            System.out.println("i am in A's inner class");
          }         
       };
       obj.show();

    }
}
*/


/*class Sde{
    public void job(){
        System.out.println("your job is to write algorithms");
    }
}

class Tester{
    public void job(){
        System.out.println("your job is to test the algorithms");
    }
}

class Demo{
    public static void main(String[] args) {
        Sde obj=new Sde();
        obj.job();
    }
}*/



//class - class --> extends
//class - interface-->implements
//interface- interface---> extends


 interface A extends X {

    int a=9;  //Methods in Interface are by default Final and Static
   
    public abstract void show();
   void config();//methods in Interface are bydefault public abstract
     

}

interface X{
    void eat();
}

class B implements A{
     public void show(){
        System.out.println("in show method");
     }

     public void config(){
        System.out.println("in config method");
     }
     public void eat(){
        System.out.println("eating... ");
     }
}

class Demo{
    public static void main(String[] args) {
        
        A obj=new B();
        obj.show();
        obj.config();
        obj.eat();
    }
}