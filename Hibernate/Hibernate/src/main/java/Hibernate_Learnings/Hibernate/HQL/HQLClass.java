package Hibernate_Learnings.Hibernate.HQL;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HQLClass {
    @Id
    private int hqlNum;
    private String hqlName;
    private String hqlQuery;

    public int getHqlNum() {
        return hqlNum;
    }

    public void setHqlNum(int hqlNum) {
        this.hqlNum = hqlNum;
    }

    public String getHqlName() {
        return hqlName;
    }

    public void setHqlName(String hqlName) {
        this.hqlName = hqlName;
    }

    public String getHqlQuery() {
        return hqlQuery;
    }

    public void setHqlQuery(String hqlQuery) {
        this.hqlQuery = hqlQuery;
    }

    @Override
    public String toString() {
        return "HQLClass{" +
                "hqlNum=" + hqlNum +
                ", hqlName='" + hqlName + '\'' +
                ", hqlQuery='" + hqlQuery + '\'' +
                '}';
    }
}
