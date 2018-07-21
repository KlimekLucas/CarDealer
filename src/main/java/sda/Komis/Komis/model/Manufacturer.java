package sda.Komis.Komis.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.net.URL;

@Entity
@Data
public class Manufacturer extends BaseModel {

       String name;

       String logo;

    public Manufacturer() {
    }

    public Manufacturer(String name, String logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
