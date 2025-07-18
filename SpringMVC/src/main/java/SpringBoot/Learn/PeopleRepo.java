package SpringBoot.Learn;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import SpringBoot.Learn.model.People;

@Repository
public interface PeopleRepo extends JpaRepository<People, Integer>{

	List<People> findByNameOrderByPointsDesc(String oneName);

	@Query("from People where name = : name")
	List<People> find(@Param("name") String oneName);

}
