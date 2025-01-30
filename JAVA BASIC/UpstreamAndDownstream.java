class A3
{
    void show()
    {
        System.out.println("In A show");
    }
}
class B3 extends A3
{
    void show1()
    {
        System.out.println("In B show");
    }
}


public class UpstreamAndDownstream {
    public static void main(String[] args) {
        A3 a=new A3();
        a.show();

        A3 a3= new B3();
        a3.show();


        B3 b=new B3();
        b.show1();


        B3 b3= (B3) a3;
        b3.show1();

    }
}
