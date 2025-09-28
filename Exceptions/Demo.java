package Exceptions;

/*public class Demo {
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
}*/


//Throw keyword in Exceptions



class MyOwnExeption extends Exception{
      public MyOwnExeption( String string){
            super(string);
      }
}



class Demo{
  public static void main(String[] args) {
    int i=0;
     int j=0;
    try{
      j=20/i;
        
      if(j==0)
      throw new MyOwnExeption("My own custome exception");
    }
   
    catch(MyOwnExeption e){
      System.out.println("Arthematic exception occured"+e);
    }
    //  catch(Exception e){
    //   System.out.println("try geneartes an Error");
    // }


    System.out.println(j);
  }
}

