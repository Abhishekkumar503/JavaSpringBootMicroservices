interface A5
{
    int age=25;
    String place="Hardoi";
    void show();
    void config();
}
interface X
{
    void imple();
}
class B5 implements A5,X
{

    @Override
    public void show() {
        System.out.println("In show");
    }

    @Override
    public void config() {
        System.out.println("In copnfig");
    }

    @Override
    public void imple() {
        System.out.println("In imple");
    }
}
public class Interface {
    public static void main(String[] args) {
        A5 a5=new B5();
        a5.show();
        a5.config();
        System.out.println(A5.age);
        System.out.println(A5.place);
        X n=new B5();
        n.imple();
    }
}
