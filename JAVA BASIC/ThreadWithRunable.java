class ThreadWithRunableA implements Runnable
{
    public void run()
    {
        for (int i = 0; i <100; i++) {
            System.out.println("HI");
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class ThreadWithRunableB implements Runnable{
    public void run()
    {
        for (int i = 0; i <99; i++) {
            System.out.println("HELLO");
            try {
                Thread.sleep(6);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ThreadWithRunable {
    public static void main(String[] args) {
        Runnable ta=new ThreadWithRunableA();
        Runnable tb=new ThreadWithRunableB();
        Thread t1=new Thread(ta);
        Thread t2=new Thread(tb);
        t1.start();
        t2.start();

    }
}
