import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyExe {
    public static void main(String[] args) throws IOException {
        /*
        Older version
         */
//        InputStreamReader in=new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(in);
//        System.out.println("Enter two number ");
//        try {
//            int num1=Integer.parseInt(br.readLine());
//            int num2=Integer.parseInt(br.readLine());
//            System.out.println(num1/num2);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            br.close();
//        }
        /*
        Try with resource version
         */
        int num=0;
        try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enput please..");
            num=Integer.parseInt(br.readLine());
            System.out.println("your Output : "+num);
        }
    }
}
