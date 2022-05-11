package tacos.data;
import java.util.Optional;

import
org.springframework.data.repository.CrudRepository;

import tacos.Taco;
public interface TacoRepository extends CrudRepository<Taco, String>{
	Iterable<Taco> findAll();
	Optional<Taco> findById(String id);
	Taco save(Taco Taco);
}
