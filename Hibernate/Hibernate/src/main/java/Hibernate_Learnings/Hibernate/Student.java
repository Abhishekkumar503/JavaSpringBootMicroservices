package Hibernate_Learnings.Hibernate;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Student_Laptop_Combination")
public class Student {
    @Id
    private int rollnumber;
    private String studentName;
    private int Marks;

    // Creating Laptop object with 1 to 1 mapping
    @OneToOne
    private Laptop laptop;


    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }


    @OneToMany(mappedBy = "student")
    private List<Laptop> lList = new ArrayList<Laptop>();

    public List<Laptop> getlList() {
        return lList;
    }

    public void setlList(List<Laptop> lList) {
        this.lList = lList;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollnumber=" + rollnumber +
                ", studentName='" + studentName + '\'' +
                ", Marks=" + Marks +
                ", laptop=" + laptop +
                ", lList=" + lList +
                '}';
    }
}
