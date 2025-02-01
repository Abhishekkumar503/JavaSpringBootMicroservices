
@java.lang.FunctionalInterface
interface A61
{
   // void show();
    void param(int i);
}
public class LambdaExpression {
    public static void main(String[] args) {
//        A61 a61=()-> System.out.println("In Main Show with Lambda Expression");
        //a61.show();

        A61 a61=i-> System.out.println("In Main Show with Parameteried Lambda Expression");
        a61.param(6);

    }
}
