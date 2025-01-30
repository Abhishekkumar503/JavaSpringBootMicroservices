abstract class A42
{
   public abstract void show();
}
public class AbstractAndAnonymousInnerClass {
    public static void main(String[] args) {
        A42 a42=new A42()
        {
            public void show()
            {
                System.out.println("In AbstractAndAnonymousInnerClass Via A42 class");
            }
        };
        a42.show();
    }
}
