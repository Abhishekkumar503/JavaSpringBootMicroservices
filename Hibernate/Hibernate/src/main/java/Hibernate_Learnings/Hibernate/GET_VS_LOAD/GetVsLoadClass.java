package Hibernate_Learnings.Hibernate.GET_VS_LOAD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GetVsLoadClass {
    @Id
    private int getVsLoadNum;
    private String getVsLoadName;
    private String getVsLoadType;

    public int getGetVsLoadNum() {
        return getVsLoadNum;
    }

    public void setGetVsLoadNum(int getVsLoadNum) {
        this.getVsLoadNum = getVsLoadNum;
    }

    public String getGetVsLoadName() {
        return getVsLoadName;
    }

    public void setGetVsLoadName(String getVsLoadName) {
        this.getVsLoadName = getVsLoadName;
    }

    public String getGetVsLoadType() {
        return getVsLoadType;
    }

    public void setGetVsLoadType(String getVsLoadType) {
        this.getVsLoadType = getVsLoadType;
    }

    @Override
    public String toString() {
        return "GetVsLoadClass{" +
                "getVsLoadNum=" + getVsLoadNum +
                ", getVsLoadName='" + getVsLoadName + '\'' +
                ", getVsLoadType='" + getVsLoadType + '\'' +
                '}';
    }
}
