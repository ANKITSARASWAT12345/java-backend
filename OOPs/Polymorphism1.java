package OOPs;


class A{
    public void show(){
        System.out.println("show from A");
    }
}
class B extends A{
    public void show(){
        System.out.println("show from B");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}


