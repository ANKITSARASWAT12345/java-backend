package Collections;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;



//comparable 

/*public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if(i%10>j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(41);
        nums.add(20);
        Collections.sort(nums,com);


        System.out.println(nums);
    }
}*/


//Stream


class Demo{
    public static void main(String[] args) {
        
        List<Integer> li=Arrays.asList(4,2,7,6,9,8);

        // Stream<Integer> s1=li.stream();
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // Stream<Integer> s3=s2.map(n->n*2);
        // s3.forEach(num->System.out.print(num+" "));


        //Predicate
      
        Predicate<Integer> p= n-> n%2==0;
            
        


        int result=li.stream()
                   .filter(p)
                   .map(n->n*2)
                   .reduce(0,(c,e)->c+e);// Inreduce function 0 is the intial value and c is carry and e is the current element
        System.out.println(result);
    }
}
