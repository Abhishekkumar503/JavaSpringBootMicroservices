class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
public class RaceConditionExe {
    public static void main(String[] args) {
        Counter c=new Counter();
        Runnable ta=()->
        {
            for (int i = 0; i <1000; i++)
                c.increment();
        };
        Runnable tb=()->
        {
            for (int i = 0; i <1000; i++)
                c.increment();
        };
        Thread t1=new Thread(ta);
        Thread t2=new Thread(tb);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(c.count);
    }
}
