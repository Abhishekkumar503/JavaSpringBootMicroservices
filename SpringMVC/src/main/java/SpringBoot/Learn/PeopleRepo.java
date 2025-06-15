package SpringBoot.Learn;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import SpringBoot.Learn.model.People;

@Repository
public interface PeopleRepo extends JpaRepository<People, Integer>{

}
