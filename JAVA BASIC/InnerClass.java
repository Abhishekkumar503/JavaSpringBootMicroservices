class A4
{
    public void show()
    {
        System.out.println("In A");
    }
    class B4
    {
        public void config()
        {
            System.out.println("In B");
        }
    }
    static class C4
    {
        public void properties()
        {
            System.out.println("In C");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A4 a4=new A4();
        a4.show();

        A4.B4 b4=a4.new B4();
        b4.config();

        A4.C4 c4=new A4.C4();
        c4.properties();
    }
}
