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

class Huamn
{
   Private int age;
   Private String name;

   public int getAge()
   {
    return age;
   }

   public String getname()
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
        Huamn h =new Huamn();
        h.setAge(25);
        h.setName("Abhishek");
        System.out.println(h.getName+" : "+h.getAge);
    }
}

