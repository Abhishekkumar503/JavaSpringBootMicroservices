abstract class car
{
    public abstract void Drive();

    public void PlayMusic()
    {
        System.out.println("Music is playing ");
    }
}
class wagonR extends car
{
    public void Drive()
    {
        System.out.println("Draving a Car ");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        car R=new wagonR();
        R.Drive();
        R.PlayMusic();
    }
}
