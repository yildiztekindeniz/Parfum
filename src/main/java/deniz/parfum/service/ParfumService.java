package deniz.parfum.service;

import deniz.parfum.entity.Parfum;

import java.util.List;

public interface ParfumService {

    public List<Parfum> findAll();
    public void save(Parfum parfum);
    public Parfum findById(String parfum);
    public Parfum findByParfumName(String parfum);
}
