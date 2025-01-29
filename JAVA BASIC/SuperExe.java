class A
{
    A()
    {
        System.out.println("Your are in A");
    }
    A(String s)
    {
        System.out.println("Your are in A String with "+s);
    }
}
class B extends A{
    B()
    {
        System.out.println("Your are in B");
    }
    B(String s)
    {
        super(s);
        System.out.println("Your are in B String with "+s);
    }
}

public class SuperExe {
    public static void main(String[] args) {
        B b=new B();
        B b1=new B("SuperTest");

    }
}
