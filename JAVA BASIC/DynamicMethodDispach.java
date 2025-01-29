class A11
{
   public void show()
    {
        System.out.println("A : show");
    }
}
class B11 extends A11
{
    public void show()
    {
        System.out.println("B : show");
    }
}
class C11 extends B11
{
    public void show()
    {
        System.out.println("C : show");
    }
}
public class DynamicMethodDispach {
    public static void main(String[] args) {

        // This is Runtime polymorphism
        A11 obj=new A11();

        obj.show();

        obj=new B11();
        obj.show();

        obj=new C11();
        obj.show();


    }
}
