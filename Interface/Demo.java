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


class Sde{
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
}