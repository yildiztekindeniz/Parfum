package deniz.parfum.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("essences")
public class Essence {
    @Id
    private String id;
    @Field("essence_name")
    private String name;

    public Essence(String name){
        this.name=name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
