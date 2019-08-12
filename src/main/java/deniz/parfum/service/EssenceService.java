package deniz.parfum.service;

import deniz.parfum.entity.Essence;

import java.util.List;

public interface EssenceService {

     List<Essence> findAll();
     void save(Essence essence);
     Essence findById(String id);
     Essence findByEssenceName(String essenceName);
}
