
public class Exceptions {
    public static void main(String[] args) {
        int i=2;
        int j=8;
        String str=null;
        int num[] =new int[6];

       // j/=i;
        try
        {
            j/=i;
            num[5]=10;
            str.length();
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by 0");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Be in your limits.");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong..... " + e);
        }
        System.out.println(j);
        System.out.println("Execution done");
    }
}
