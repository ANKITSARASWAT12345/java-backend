
//Use Threads for multitasking

/*class A extends Thread{
    public void run(){

        for(int i=0;i<100;i++){
        System.out.println("ankit");
    }
}
}


class B extends Thread{
    public void run(){

        for(int i=0;i<100;i++){
        System.out.println("Saraswat");
    }
}
}



public class Demo {
      public static void main(String[] args) {
        A obj1=new A();
         B obj2=new B();
      
 
        obj1.setPriority(10);
        // System.out.println(obj1.getPriority());
        // System.out.println(obj2.getPriority());
         obj1.start();
         obj2.start(); 

      }
}
*/


//Now we will implements Runnable class instead of extending Thread class , because Runnable is parent class of Thread 


class Z{
    public void m1(){
        System.out.println("hello");
    }
}

class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("ankit");
            try{
                Thread.sleep(5);
            }

            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("saraswat");
        }
    }
}

class Demo{
    public static void main(String[] args) {
        A obj1=new A();
        B obj3=new B();
        obj1.start();
        obj3.start();
    }
}