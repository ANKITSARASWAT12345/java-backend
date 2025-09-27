package Exceptions;

public class Demo {
    public static void main(String[] args) {
        int j=6;

       System.out.println("running before the error");
       int result=0;

       try{
         result=20/j;
       }

       catch(Exception e){
        System.out.println("Error is : "+e);
       }

        System.out.println(result);

    }
}
