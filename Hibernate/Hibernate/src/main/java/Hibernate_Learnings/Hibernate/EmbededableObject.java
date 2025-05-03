package Hibernate_Learnings.Hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmbededableObject {

    // We can use as Alien name;

    private String fName,mName,lName;

    @Override
    public String toString() {
        return "EmbededableObject{" +
                "fName='" + fName + '\'' +
                ", mName='" + mName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
