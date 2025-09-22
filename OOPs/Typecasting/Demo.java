package OOPs.Typecasting;


//Typecasting in Java

/*Typecasting in Java is the process of converting a variable from one data type to another. 
This is necessary when operations involve variables of different data types or when a value of one type 
needs to be assigned to a variable of a different, but compatible, type. */


/* 
public class Demo {
    public static void main(String[] args) {
        double num=4.5;
        int a=(int) num;
        System.out.println(a);
    }
}

*/


//typecasting in OOPs

/*Type casting in Object-Oriented Programming (OOP) refers to the process of converting an object of one class type to another. 
This is particularly relevant in the context of inheritance, where objects can be treated as instances of their superclasses or 
subclasses.

     Types of Typecasting
--Upcasting (Widening Conversion)
--Downcasting (Narrowing Conversion)
*/


class A{
    public void show1(){
        System.out.println("i am in show() of A");
    }
}


class B extends A{
    public void show2(){
        System.out.println("i am in show() of B");
    }
}

class Demo{
    public static void main(String[] args) {
        A obj1=new B();
       
        obj1.show1();

        B obj2=  (B) obj1; //upcasting of object 
        obj2.show2();
        obj2.show1();
    }
}