// public class Array {
//     public static void main(String[] args) {
//         int arr[]=new int[4];
//         arr[0]=1;
//         arr[1]=5;
//         arr[2]=9;
//         arr[3]=7;

//         int i=0;
//         while(i<4)
//         {
//             System.out.println(arr[i]);
//             i++;
//         }
//     }
// }

class Human1
{
   private  int age;
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

public class Array {
    public static void main(String[] args) {
        Human1 h =new Human1();
        h.setAge(25);
        h.setName("Abhishek");
        System.out.println(h.getName()+" : "+h.getAge());
    }
}

