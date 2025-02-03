class threadA extends Thread
{
    public void run()
    {
        for (int i = 0; i <10; i++) {
            System.out.println("HI");
        }
    }
}
class threadB extends Thread{
public void run()
{
    for (int i = 0; i <10; i++) {
        System.out.println("HELLO");
    }
}
}
public class ThreadsExe {
    public static void main(String[] args) {
        threadA ta=new threadA();
         threadB tb=new threadB();
        ta.start();
        tb.start();
    }
}


/* Output
HI
HELLO
HELLO
HELLO
HELLO
HELLO
HELLO
HELLO
HELLO
HELLO
HELLO
HI
HI
HI
HI
HI
HI
HI
HI
HI
 */