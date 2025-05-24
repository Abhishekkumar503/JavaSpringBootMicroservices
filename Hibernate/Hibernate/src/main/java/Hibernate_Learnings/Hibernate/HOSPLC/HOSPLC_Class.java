package Hibernate_Learnings.Hibernate.HOSPLC;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HOSPLC_Class {
    @Id
    private int hosplcNum;
    private String hosplcName;
    private String hoslcType;

    public String getHosplcName() {
        return hosplcName;
    }

    public void setHosplcName(String hosplcName) {
        this.hosplcName = hosplcName;
    }

    public int getHosplcNum() {
        return hosplcNum;
    }

    public void setHosplcNum(int hosplcNum) {
        this.hosplcNum = hosplcNum;
    }

    public String getHoslcType() {
        return hoslcType;
    }

    public void setHoslcType(String hoslcType) {
        this.hoslcType = hoslcType;
    }

    @Override
    public String toString() {
        return "HOSPLC_Class{" +
                "hosplcNum=" + hosplcNum +
                ", hosplcName='" + hosplcName + '\'' +
                ", hoslcType='" + hoslcType + '\'' +
                '}';
    }
}
