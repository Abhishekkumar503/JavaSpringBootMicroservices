package Hibernate_Learnings.Hibernate.Caching;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LevelCaching {
    @Id
    private int levelNumber;
    private String levelName;
    private String leveltype;

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public String getLeveltype() {
        return leveltype;
    }

    public void setLeveltype(String leveltype) {
        this.leveltype = leveltype;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }
}
