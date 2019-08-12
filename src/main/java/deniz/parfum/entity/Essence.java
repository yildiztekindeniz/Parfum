package deniz.parfum.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("essences")
public class Essence {

    @Id
    private String id;

    @Field("essence_name")
    private String essenceName;

    public Essence(){

    }

    public Essence(String essenceName){

        this.essenceName=essenceName;

    }

    public String getEssenceName() {
        return essenceName;
    }

    public void setEssenceName(String name) {
        this.essenceName = essenceName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
