package Annotations;

@Deprecated // it means that this class in future can be remove or changed

class A{
    public void show(){
        System.out.println("in A class");
    }
}

class B extends A{
    @Override   /*  The @Override annotation in Java is a marker annotation used to indicate 
    //that a method in a subclass is intended to override a method in its superclass. */
    
    public void show(){
        System.out.println("in B class");
    }
}

public class Demo {
    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }
}
