////class ThreadRunnableWithLambdaExpressionA implements Runnable
////{
////    public void run()
////    {
////        for (int i = 0; i <100; i++) {
////            System.out.println("HI");
////            try {
////                Thread.sleep(6);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
////        }
////    }
////}
//class ThreadRunnableWithLambdaExpressionB implements Runnable{
//    public void run()
//    {
//        for (int i = 0; i <99; i++) {
//            System.out.println("HELLO");
//            try {
//                Thread.sleep(6);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
public class ThreadRunnableWithLambdaExpression {
    public static void main(String[] args) {
        Runnable ta=()->
    {
        for (int i = 0; i <100; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    };

        Runnable tb=()->
        {
            for (int i = 0; i <100; i++) {
                System.out.println("HELLO");
                try {
                    Thread.sleep(6);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1=new Thread(ta);
        Thread t2=new Thread(tb);
        t1.start();
        t2.start();

    }
}

