package deniz.parfum.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;
import java.util.List;

@Document("parfums")
public class Parfum {

    private String id;

    @Field("parfum_name")
    private String parfumName;

    private String brand;

    private String parfumeur;

    private List<Essence> essences;

   // private String concentration;

    public Parfum(){
        this.essences=new ArrayList<>();

    }

   /* public Parfum(String parfumName, String brand, String parfumeur, List<Essence> essences,String concentration) {
        this.parfumName = parfumName;
        this.brand = brand;
        this.parfumeur = parfumeur;
        this.essences = essences;
        this.concentration=concentration;
    }
*/
    public Parfum(String parfumName, String brand, String parfumeur, List<Essence> essences) {
        this.parfumName = parfumName;
        this.brand = brand;
        this.parfumeur = parfumeur;
        this.essences = essences;
    }

    public String getParfumName() {
        return parfumName;
    }

    public void setParfumName(String parfumName) {
        this.parfumName = parfumName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getParfumeur() {
        return parfumeur;
    }

    public void setParfumeur(String parfumeur) {
        this.parfumeur = parfumeur;
    }

    public List<Essence> getEssences() {
        return essences;
    }

    public void setEssences(List<Essence> essences) {
        this.essences = essences;
    }
}
