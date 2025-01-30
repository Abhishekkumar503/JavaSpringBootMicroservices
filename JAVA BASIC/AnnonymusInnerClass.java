class A41
{
    void show()
    {
        System.out.println("In A");
    }
}

public class AnnonymusInnerClass {
    public static void main(String[] args) {
        A41 a41=new A41()
        {
            void show()
            {
                System.out.println("In AnonymousInnerClass");
            }
        };
        a41.show();
    }
}
