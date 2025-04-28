package Hibernate_Learnings.Hibernate;

import jakarta.persistence.*;

@Entity
@Table(name = "Annotation_Lernering")
public class AnnotationsClasses {
@Id
    private int Aid;

    public String getAname() {
        return Aname;
    }

    public void setAname(String aname) {
        Aname = aname;
    }

    public int getAid() {
        return Aid;
    }

    public void setAid(int aid) {
        Aid = aid;
    }

    public String getADesc() {
        return ADesc;
    }

    public void setADesc(String ADesc) {
        this.ADesc = ADesc;
    }
//    @Transient
    private String Aname;
   @Column(name = "ADescription")
    private String ADesc;
}
