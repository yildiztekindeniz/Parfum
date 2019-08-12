package deniz.parfum.repository;

import deniz.parfum.entity.Parfum;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ParfumRepository extends MongoRepository<Parfum,String> {

     Optional<Parfum> findById(String name);
     Parfum findByParfumName(String parfumName);

}
