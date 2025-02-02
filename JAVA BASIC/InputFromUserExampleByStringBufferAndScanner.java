import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUserExampleByStringBufferAndScanner {
    public static void main(String[] args) {
        /*
        Readclass
         */
//        System.out.println("Enter the number");
//        int num;
//        try {
//             num=System.in.read();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(num);
//        System.out.println(num-48);

        /*
        BufferReader
         */

//        InputStreamReader in =new InputStreamReader(System.in);
//        BufferedReader br=new BufferedReader(in);
//        int num;
//        System.out.println("Enter the input");
//        try {
//             num=Integer.parseInt(br.readLine());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(num);

        /*
        Scanner
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Input");
        int num1=sc.nextInt();
        System.out.println("your output : "+num1);
    }
}
