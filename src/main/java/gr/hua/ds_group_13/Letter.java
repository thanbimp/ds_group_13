package gr.hua.ds_group_13;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "letters")
public class Letter {

    @Id
    private String id;
    private String profFName;
    private String profLName;
    private String body;

    public Letter(){

    }

    public Letter(String profFName, String profLName, String body) {
        this.id = UUID.randomUUID().toString();
        this.profFName = profFName;
        this.profLName = profLName;
        this.body = body;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfFName() {
        return profFName;
    }

    public void setProfFName(String profFName) {
        profFName = profFName;
    }

    public String getProfLName() {
        return profLName;
    }

    public void setProfLName(String profLName) {
        this.profLName = profLName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
