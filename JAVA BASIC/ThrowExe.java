
public class ThrowExe {
    public static void main(String[] args) {
        int i=0;
        int j=8;

        // j/=i;
        try
        {
            j/=i;
            if(j==0)
                throw new ArithmeticException("You are dividing by Zero");
        }
        catch (ArithmeticException e) {
            j=18/1;
            //System.out.println("Divide by 0");
        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("Be in your limits.");
//        }
//        catch (Exception e)
//        {
//            System.out.println("Something went wrong..... " + e);
//        }
        System.out.println(j);
        System.out.println("Execution done");
    }
}
