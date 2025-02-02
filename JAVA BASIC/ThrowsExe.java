import jdk.dynalink.beans.StaticClass;

// this show you class not found exception


import static java.lang.Class.forName;

class AA
{
    void show() throws ClassNotFoundException {
        Class.forName("ABC");
        System.out.println("Throws exceptions");
    }
}
public class ThrowsExe {
    static {
        System.out.println("Class loaded");
    }
    public static void main(String[] args)  {
        AA obj =new AA();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
