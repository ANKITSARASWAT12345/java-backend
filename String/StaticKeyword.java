import java.util.*;
public class StaticKeyword {
    public static void main(String[] args) throws Exception {
    //     Demo obj1=new Demo();
       
    //     obj1.name="tarun";
    //     obj1.price=1000;

    //     Demo obj2=new Demo();

    //     obj2.name="sasank";
     
    //     obj2.price=1200;

     
    //    obj2.print();
    //      obj1.print();
      Class.forName("Demo");
        

    }
}

class Demo{
    String name;
    int price;
    static String address;

    static {
        address="mathura";
        System.out.println(address);
    }

    public void print(){
            System.out.println("name:"+ name +" price: "+price+" address: "+address);
        }
}
