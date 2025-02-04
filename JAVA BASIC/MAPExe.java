import java.util.HashMap;
import java.util.Map;

public class MAPExe {
    public static void main(String[] args) {
        Map<String,Integer> Family=new HashMap<String,Integer>() ;
        Family.put("Abhishek",25);
        Family.put("Sandeep",27);
        Family.put("Sunny",20);
        Family.put("Shivam",10);
        Family.put("Kapil",25);

        System.out.println(Family);
        System.out.println(Family.keySet());
        for (String str : Family.keySet())
            System.out.println(str+" : "+Family.get(str));
    }
}
