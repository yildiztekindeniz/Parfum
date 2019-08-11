package deniz.parfum.service;


import deniz.parfum.entity.Essence;
import deniz.parfum.repository.EssenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EssenceServiceImpl implements EssenceService {
    private EssenceRepository essenceRepository;

    @Autowired
    public EssenceServiceImpl(EssenceRepository essenceRepository){
        this.essenceRepository=essenceRepository;
    }

    @Override
    public List<Essence> findAll() {

        List<Essence> essences=essenceRepository.findAll();
        return essences;
    }

    @Override
    public void save(Essence essence) {

        essenceRepository.save(essence);

    }

    @Override
    public Essence findById(String id) {
        Optional<Essence> result=essenceRepository.findById(id);
        Essence essence=null;
        if(result.isPresent()){
            essence=result.get();
        }
        else{
            throw new RuntimeException("Essence id not found" + id);
        }

        return essence;
    }
}
