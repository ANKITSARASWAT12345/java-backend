package OOPs.Interface;

/*@FunctionalInterface
interface A{
    void show();
}



public class Demo {
    public static void main(String[] args) {
      A obj=new A() {
        public void show(){
            System.out.println("i am implemention of Interface of A");
        }
      };
      obj.show();
    }
}*/


// Now i will use Lambda Expression in Functional interface
//Oracle introduced Lambda expression in Java 8
//We can use Lambda expression in functinal Interface because in functional interface it has only one method,
// so instead of writting full name , like public void show(), we just use the Lambda interface




interface  A{
    
    void show(int num);
}

class Demo{
    public static void main(String[] args) {
         A obj=( num)-> {
            System.out.println("this is implementation of Lambda expression in Interface: "+num);
         };
         obj.show(5);
    }
}
