package sda.Komis.Komis.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
public class Client extends BaseModel implements Serializable {

    @NotBlank(message = "pole nie moze byc puste")
    private  String name;
    @NotBlank(message = "pole nie moze byc puste")
    private  String lastName;
    @NotBlank(message = "pole nie moze byc puste")
    private  String adress;
    @NotBlank(message = "pole nie moze byc puste")
    private  String NIP;
    @NotBlank(message = "pole nie moze byc puste")
    @Size(min = 10, max = 12, message = "pole musi posiadać 11 znaków")
    private  String Pesel;


    public Client() {
    }

    public Client(String name, String lastName, String adress, String NIP, String pesel) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.NIP = NIP;
        Pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getPesel() {
        return Pesel;
    }

    public void setPesel(String pesel) {
        Pesel = pesel;
    }
}
