package innerClass;



//Inner class

 /*class A{
    public void show(){
        System.out.println("I am in show of A");
    }
    class B{
        public void add(){
            System.out.println("Add two values");
        }
    }
 }

public class Demo {


    public static void main(String[] args) {
        A obj=new A();
        obj.show();
       A.B obj1=obj.new B();
       obj1.add();

    }
    
}
*/


//Anonumus class


/*class A{
    public void show(){

        System.out.println("I am in show of A ");
    }
}

class Demo{
    public static void main(String[] args) {
        

        A obj=new A(){

            public void show(){
                System.out.println("I am in show of B");
            }
        };

        obj.show();
     
    }
}*/


class A{
    public void show1(){

        System.out.println("I am in show of A ");
    }
}

class Demo{
    public static void main(String[] args) {
        

        A obj=new A(){

            public void show1(){
                System.out.println("I am in show of B");
            }
        };

        obj.show1();
     
    }
}


