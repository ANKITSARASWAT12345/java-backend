

enum Car{
    Forturner(50), Creta(25), Discovery(125), Fronxx(8);
      private int price;
    private Car(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
}


public class Demo {
    public static void main(String[] args) {
        Car ss[]=Car.values();
        

        for(Car s: ss){
            System.out.println(s+" "+s.ordinal());//   Ordinal is used for finding the index of the enum just like as Array's index which starts from 0; 
        }


        Car c=Car.Creta;

        System.out.println(c+" "+c.getPrice());
    }
}
