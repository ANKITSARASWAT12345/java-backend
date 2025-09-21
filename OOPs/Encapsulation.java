package OOPs;

public class Encapsulation {
    public static void main(String[] args) {
         Helper obj=new Helper();
         obj.setAge(23);
         obj.setName("Tarun");
         System.out.println(obj.getAge());
         System.out.println(obj.getName());
    }
}

class Helper{
    private String name;
   private  int age;

public void setAge(int age){
    this.age=age;
}

public void setName(String name){
    this.name=name;
}


   public String getName(){
    return name;
   }

   public int getAge(){
    return age;
   }

}
