package deniz.parfum.service;

import deniz.parfum.entity.Essence;

import java.util.List;

public interface EssenceService {

    public List<Essence> findAll();
    public void save(Essence essence);
    public Essence findById(String id);

}
