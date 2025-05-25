package Hibernate_Learnings.Hibernate.JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JPAClass {
    @Id
    private int jpaNum;
    private String jpaname;
    private String jpaColor;

    public int getJpaNum() {
        return jpaNum;
    }

    public void setJpaNum(int jpaNum) {
        this.jpaNum = jpaNum;
    }

    public String getJpaname() {
        return jpaname;
    }

    public void setJpaname(String jpaname) {
        this.jpaname = jpaname;
    }

    public String getJpaColor() {
        return jpaColor;
    }

    public void setJpaColor(String jpaColor) {
        this.jpaColor = jpaColor;
    }

    @Override
    public String toString() {
        return "JPAClass{" +
                "jpaNum=" + jpaNum +
                ", jpaname='" + jpaname + '\'' +
                ", jpaColor='" + jpaColor + '\'' +
                '}';
    }
}
