import java.util.*;

public class CollectionExe {
    public static void main(String[] args) {
//          Collection<Integer> c=new ArrayList<Integer>();
//           List<Integer> c=new ArrayList<Integer>();
//        Set<Integer> c=new HashSet<Integer>();
//        Set<Integer> c=new TreeSet<Integer>();
        Collection<Integer> c=new TreeSet<Integer>();
        c.add(12);
        c.add(45);
        c.add(69);
        c.add(27);
        c.add(90);

        // itrator
        Iterator<Integer> i=c.iterator();
        System.out.println(i.next());
        System.out.println(i.hasNext());
        while (i.hasNext())
            System.out.println(i.next());
        //itrator end

        System.out.println(c.size());
//        System.out.println(c.(4));
        System.out.println(c);
        for (int n: c)
            System.out.println(n);
    }
}
