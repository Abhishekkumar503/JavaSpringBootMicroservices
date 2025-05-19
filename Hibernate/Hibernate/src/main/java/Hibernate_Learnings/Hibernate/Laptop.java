package Hibernate_Learnings.Hibernate;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lId;
    private String lName;



    @ManyToOne
    private Student student ;

    public Student getStudent() {
        return student;
    }



    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToMany
    private List<Student> student1 = new ArrayList<Student>();


    public List<Student> getStudent1() {
        return student1;
    }

    public void setStudent1(List<Student> student1) {
        this.student1 = student1;
    }



    

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

}
