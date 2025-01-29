public class CalculatorExe {
    public static void main(String[] args) {

        // This is called Multi lavel inhertance

        VeryAdvCalc c1=new VeryAdvCalc();
        int r1=c1.AddExe(4,6);
        int r2=c1.SubtractExe(6,4);
        int r3=c1.MulExe(2,3);
        int r4=c1.DivExe(10,2);
        double r5=c1.power(4,2);
        System.out.println("Addition : "+r1 +" "+"Substraction : "+r2);
        System.out.println("Multiply : "+r3 +" "+"Divide : "+r4);
        System.out.print("Power : "+r5);


    }
}
