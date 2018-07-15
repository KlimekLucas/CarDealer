package sda.Komis.Komis.model;


import lombok.Data;
import sda.Komis.Komis.dto.WorkerDto;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Worker extends BaseModel {

    private String name;
    private String lastName;
    private String adress;
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;

    @ManyToMany
    private Set<WorkersRoles> roles;


    public Worker() {
    }


    public Worker(String name, String lastName, String adress, Date hireDate, Set<WorkersRoles> roles) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
        this.hireDate = hireDate;
        this.roles = roles;
    }

    public void addRole(WorkersRoles workersRoles) {
        if (roles == null) {
            roles = new HashSet<>();
        }
        roles.add(workersRoles);
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

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Set<WorkersRoles> getRoles() {
        return roles;
    }

    public void setRoles(Set<WorkersRoles> roles) {
        this.roles = roles;
    }
}
