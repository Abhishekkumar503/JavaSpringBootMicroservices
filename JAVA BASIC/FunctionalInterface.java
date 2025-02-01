
@java.lang.FunctionalInterface
interface A6
{
    void show();
}
//class B6 implements A6
//{
//
//    @Override
//    public void show() {
//        System.out.println("In B show");
//    }
//}
public class FunctionalInterface {
    public static void main(String[] args) {
        A6 a6=new A6() {
            @Override
            public void show() {
                System.out.println("In Main Show");
            }
        };
        a6.show();
    }
}
