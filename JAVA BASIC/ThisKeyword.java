class Human2
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

    public void setAge(int age)
    {
       this.age=age;
    }

    public void setName(String n)
    {
        name=n;
    }


}

public class ThisKeyword {
    public static void main(String[] args) {
        Human2 h =new Human2();
        h.setAge(25);
        h.setName("Abhishek");
        System.out.println(h.getName()+" : "+h.getAge());
    }
}




