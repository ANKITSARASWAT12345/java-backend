

public class Demo {
    public static void main(String[] args) {
        int i=0;
        int j=0;

        int arr[]=new int[5];
        String s=null;
        try{
        j=22/i;

         

        if(j==0){
            throw new Exception("");
        }
        System.out.println(s.length());
        System.out.println(arr[5]);
        }
        catch(ArithmeticException e){
            System.out.println("arthmetic exception: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
        System.out.println("index out of bond exception: "+e); 

        }
        catch(Exception e){
            System.out.println(e);
        }
       System.out.println(arr[4]);

    }
}
