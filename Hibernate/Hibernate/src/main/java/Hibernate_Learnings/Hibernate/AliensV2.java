package Hibernate_Learnings.Hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AliensV2 {

	@Id
	private int aid;
	private EmbededableObject aname;            //  this obj variable from class EmbededableObject.java
	private String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}

	public EmbededableObject getAname() {
		return aname;
	}

	public void setAname(EmbededableObject aname) {
		this.aname = aname;
	}

	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
}
