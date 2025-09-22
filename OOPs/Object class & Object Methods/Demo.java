


class Laptop {
    String name;
    int price;
    public String toString(){
        return "hey ";
    }
    public boolean equals(Laptop  that){
        if(this.name.equals(that.name) && this.price==that.price){
            return true;
        }
        return false;
    }
}

public class Demo {
    public static void main(String[] args) {
         Laptop obj1=new Laptop();
         obj1.name="Asusx515";
         obj1.price=45000;
        //  System.out.println(obj1.toString());


         Laptop obj2=new Laptop();
         obj2.name="Asusx5153";
         obj2.price=45000;
         boolean result=obj1.equals(obj2);
         System.out.println(result);
    }
}
