import java.util.Objects;

class laptop01
{
    String model;
    int price;

    //if you declare toString then you can manipulate
    // your output Other wise this will  return default values  Like : laptop01@6acbcfc0
    @Override
    public String toString() {
        return "THIS is Example";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof laptop01 laptop01)) return false;
        return price == laptop01.price && Objects.equals(model, laptop01.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}

public class ObjectClassEquals_toString_hashcode {
    public static void main(String[] args) {
        laptop01 l=new laptop01();
        l.model="MACBOOK PRO";
        l.price=75620;
        System.out.println(l.toString());
        System.out.println(l.hashCode());
        System.out.println(l.model+" : "+l.price);
        System.out.println(l);

        laptop01 l2=new laptop01();
        l2.model="MACBOOK PRO";
        l2.price=75620;

        System.out.println(l.equals(l2));
        System.out.println(l == l2);
    }


}

/* O/P
THIS is Example
717990080
MACBOOK PRO : 75620
THIS is Example
true
false

 */
