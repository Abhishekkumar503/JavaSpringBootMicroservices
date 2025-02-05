import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExe {
    public static void main(String[] args) {
     // Thi feature comes in 1.8 Version of java

       List<Integer> li= Arrays.asList(4,5,9,8);

        System.out.println(li);
        System.out.println();
       int sum=0;
       for(Integer n : li)
       {
           if(n%2==0) {
               n *= 2;
               sum += n;
           }
       }
        System.out.println(sum);
        System.out.println();

       // Now above for loop condition can be written form stream
        Stream<Integer>s=li.stream();
        s.forEach(n-> System.out.println(n));
        System.out.println();
        Stream<Integer> s1=s.filter(n-> n%2==0);
        s1.forEach(n-> System.out.println(n));
        System.out.println();
        Stream<Integer> s2=s1.map(n->n*2);
        s2.forEach(n-> System.out.println(n));
        System.out.println();

        int result =s2.reduce(0,(c,e)->c+e);
        System.out.println();

        // Above lengthy code willl reduce it ********************
        int result01 =li.stream()
                .filter(n-> n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(result01);


    }
}
