class Human3
{
    private  int age;
    private String name;

    public Human3(){
       age =24;
       name="MyName";
    }

    public Human3(int a,String n){
        age =a;
        name=n;
    }

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

public class ConstructorExe {
    public static void main(String[] args) {
        Human3 h =new Human3();
        Human3 h1 =new Human3(26,"DEMLA_DEMLA");
        h.setAge(25);
        h.setName("Abhishek");

        System.out.println(h.getName()+" : "+h.getAge());
        System.out.println(h1.getName()+" : "+h1.getAge());
    }
}






