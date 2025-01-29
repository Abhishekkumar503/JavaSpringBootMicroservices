     class A1
    {
        void show ()
        {
            System.out.println("A : ");
        }
    }

     class B1 extends A1
    {
        void show ()
        {
            System.out.println("B : ");
        }

    }

public class MethodOverriding {

    public static void main(String[] args) {
    B1 b=new B1();
    b.show();
    }
}
