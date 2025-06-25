package SpringBoot.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductDB extends JpaRepository<Product, Integer>{

	List<Product> findByWarrenty(String i);

	List<Product> findByName(String name);

	List<Product> findByPlace(String place);

	@Query("from Product where name like %:text% or place like %:text% or type like %:text%")
	List<Product> find(@Param("text") String text);

	List<Product> findByType(String type);

}
