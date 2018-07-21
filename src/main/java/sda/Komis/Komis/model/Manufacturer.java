package sda.Komis.Komis.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.net.URL;

@Entity
@Data
public class Manufacturer extends BaseModel {

       String name;

       URL logo;

    public Manufacturer() {
    }

    public Manufacturer(String name, URL logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getLogo() {
        return logo;
    }

    public void setLogo(URL logo) {
        this.logo = logo;
    }
}
