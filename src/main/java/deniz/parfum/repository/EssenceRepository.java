package deniz.parfum.repository;

import deniz.parfum.entity.Essence;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface EssenceRepository extends MongoRepository<Essence,String> {
    Optional<Essence> findById(String id);
    Essence findByEssenceName(String essenceName);
}
