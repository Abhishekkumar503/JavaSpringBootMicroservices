interface  computer
{
   void show();
}
class laptop implements computer
{
    public void show()
    {
        System.out.println("Coding then compile and run in Laptop");
    }
}
class desktop implements computer
{
    public void show()
    {
        System.out.println("Coding then compile and run in Desktop");
    }
}
class developer
{
    public void devApp(computer c)
    {
        c.show();
    }
}

public class InterfaceExplain {
    public static void main(String[] args) {
        computer lap=new laptop();
        computer desk=new desktop();
        developer dev=new developer();
        dev.devApp(lap);
        dev.devApp(desk);
    }
}
