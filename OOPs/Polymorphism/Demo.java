package OOPs.Polymorphism;




//Method Overlaoding 

/*class A{
    public int add(int a, int b){
        return a+b;
    }
    public double add(double a, double b){
        return a+b;
    }
}





public class Demo {
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.add(2.2, 3.2));
    }
}*/



//Method overloading(Compile time polymorphism)

class A{
    public void show(){
        System.out.println("show of class A");
    }
}
class B extends A{
    public void show(){
        System.out.println("show of class B");
    }
}

class Demo{
    public static void main(String[] args) {
        A obj1=new B();
        obj1.show();

        B obj2=(B) obj1;  // Downcasting 
        obj2.show();

        B obj3=new B();
        A obj4= (A) obj3;
        obj4.show();

    }
}
