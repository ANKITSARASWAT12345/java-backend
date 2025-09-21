package OOPs.This;

public class Super extends Object {
    
    public Super(){
            super();

        System.out.println("hello from super ankit");
    }

    public Super(int n){
        System.out.println("hello from super ankit 3");
    }
    public Super(int n, int m){
        System.out.println("ankit have value n and m");
    }

    
}

class B extends Super{

public B(){
        super();

    System.out.println("hello from ankit 1");

}
public B(int n){
       
       this();
    System.out.println("hello from ankit 3");
}

  
}

class Main{
    public static void main(String[] args) {
        B obj=new B(3);

      

    }
}

