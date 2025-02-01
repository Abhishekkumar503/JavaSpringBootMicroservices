enum status
{
    InProcess,
    Success,
    Failed,
    Invalid ;

}
enum laptops
{
    macbook(2090),pavelion(609), thinkPad(798), lenovoPad;
    private int price;

    laptops() {
        price=505;
    }

    private laptops(int price) {
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enum {
    public static void main(String[] args) {
        status[] s =status.values();
        for (status ss :s)
            System.out.println(ss + " : " + ss.ordinal());
        status ss=status.Success;
        if (ss == (status.InProcess))
            System.out.println("Wait for meantime");
        else if (ss==(status.Success))
            System.out.println("Woah you operation is done");
        else if (ss==(status.Failed))
            System.out.println("Better luck next time");
        else
            System.out.println("Please Redo!!");

        // get the super class
        System.out.println(s.getClass().getSuperclass());

        laptops lap=laptops.pavelion;
        System.out.println(lap);


        for (laptops laps : laptops.values())
            System.out.println(laps + " : " + laps.ordinal());

    }
}
