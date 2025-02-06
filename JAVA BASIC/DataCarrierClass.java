import java.util.Objects;

class Alein
{
    private int id;
    private String name;

    public Alein(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Alein{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alein alein)) return false;
        return id == alein.id && Objects.equals(name, alein.name);
    }



}
// Lets Create another class data carrier
record Alein2o(int id,String name){};


public class DataCarrierClass {
    public static void main(String[] args) {
        Alein a1=new Alein(1,"Abhishek");
        Alein a2=new Alein(1,"Abhishek");
        System.out.println(a1);
        System.out.println(a1.equals(a2));
        System.out.println();

        Alein2o a21=new Alein2o(1,"Abhishek");
        Alein2o a22=new Alein2o(1,"Abhishek");
        System.out.println(a21);
        System.out.println(a21.equals(a22));



    }
}
