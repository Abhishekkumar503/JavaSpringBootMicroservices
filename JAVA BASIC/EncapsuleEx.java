 class Human
{
   private int age;
   private String name;

   public int getAge()
   {
    return age;
   }

   public String getName()
   {
    return name;
   }

   public void setAge(int a)
   {
     age=a;
   }

   public void setName(String n)
   {
     name=n;
   }


}

public class EncapsuleEx {
    public static void main(String[] args) {
        // Human h =new Human();
        // h.setAge(25);
        // h.setName("Abhishek");
        // System.out.println(h.getName+" : "+h.getAge);

        Human obj =new Human();
        obj.setAge(25);

        System.out.println(" till here it works");
    }
}
