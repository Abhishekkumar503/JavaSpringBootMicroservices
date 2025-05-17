package Hibernate_Learnings.Hibernate;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    private int lId;
    private String lName;



    @ManyToOne
    private Student student ;

    public Student getStudent(Student student) {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
