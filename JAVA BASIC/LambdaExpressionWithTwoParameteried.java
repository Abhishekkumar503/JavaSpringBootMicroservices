@java.lang.FunctionalInterface
interface XYZ
{
    int parameteriedInterfaceLambdaExpression(int i,float j);
}
public class LambdaExpressionWithTwoParameteried {
    public static void main(String[] args) {
//        XYZ xyz=new XYZ() {
//            @Override
//            public int parameteriedInterfaceLambdaExpression(int i, float j) {
//                return (int) (i+j);
//            }
//        };
//        System.out.println(xyz.parameteriedInterfaceLambdaExpression(9,7.93381306f));

//        XYZ xyz=(int i, float j) ->{
//                return (int) (i+j);
//            };

        XYZ xyz=(int i, float j) ->(int) (i+j);

        System.out.println(xyz.parameteriedInterfaceLambdaExpression(9,7.93381306f));
    }
}
