package peopleWithSQL;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends CrudRepository <Peoples,Integer>
{
	Iterable<Peoples> findByName(String name);
}
