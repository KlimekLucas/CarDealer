package sda.Komis.Komis.dto;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;


public class WorkerDto {

    @NotBlank(message = "pole nie moze byc puste")
    private String name;
    @NotBlank(message = "pole nie moze byc puste")
    private String lastName;
    @NotBlank(message = "pole nie moze byc puste")
    private String adress;
    @NotBlank(message = "pole nie moze byc puste")
    private String hireDate;
    @NotBlank(message = "pole nie moze byc puste")
    private String roles;


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

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
