class A2 // if you use here then no one can use your class (Not Inherit)
{
     public void show() // if you use here then no one can override your Method
    {
        System.out.println("BY Abhishek");
    }

}
class B2 extends A2
{
    public void show()
    {
        System.out.println("BY ABIS");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        final int a=9;
       // a=89;
        A2 obj=new B2();
        obj.show();
    }
}
