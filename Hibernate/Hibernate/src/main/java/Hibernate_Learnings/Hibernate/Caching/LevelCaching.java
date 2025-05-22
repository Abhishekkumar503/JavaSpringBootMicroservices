package Hibernate_Learnings.Hibernate.Caching;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
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

    @Override
    public String toString() {
        return "LevelCaching{" +
                "levelNumber=" + levelNumber +
                ", levelName='" + levelName + '\'' +
                ", leveltype='" + leveltype + '\'' +
                '}';
    }
}
