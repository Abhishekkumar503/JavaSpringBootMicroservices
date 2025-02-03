
class threadsPriorityA extends Thread
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
class threadsPriorityB extends Thread{
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
public class ThreadsPriorityExe {
    public static void main(String[] args) {
        threadsPriorityA ta=new threadsPriorityA();
        threadsPriorityB tb=new threadsPriorityB();
//        System.out.println(ta.getPriority());
//        tb.setPriority(Thread.NORM_PRIORITY);


        ta.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        tb.start();
    }
}


/*
OUTPUT

HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HI
HELLO
HELLO
HI
HELLO
HI
HELLO
HI
HI
HELLO
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HI
HELLO
HI
HELLO
HELLO
HI
HI
HELLO

 */