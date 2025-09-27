

enum Status{
    Rejected, Pending, Completed,Waiting
}


public class Demo {
    public static void main(String[] args) {
        Status ss[]=Status.values();
        

        for(Status s: ss){
            System.out.println(s+" "+s.ordinal());
        }
    }
}
