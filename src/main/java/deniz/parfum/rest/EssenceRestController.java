package deniz.parfum.rest;

import deniz.parfum.entity.Essence;
import deniz.parfum.service.EssenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EssenceRestController {

    private EssenceService essenceService;
    @Autowired
    public EssenceRestController(EssenceService essenceService){
        this.essenceService=essenceService;
    }

    @GetMapping("/essences")
    public List<Essence> getEssences(){

        List<Essence> essences=essenceService.findAll();
        return essences;
    }

    @PostMapping("/essences")
    public void insert(@RequestBody Essence essence){
        essenceService.save(essence);
    }

    @PutMapping("/essences")
    public void update(@RequestBody Essence essence){
        essenceService.save(essence);
    }



    @GetMapping("/essences/{essenceName}")
    public Essence getEssence(@PathVariable("essenceName") String essenceName){

        Essence essence=essenceService.findByEssenceName(essenceName);
        return essence;
    }


}
