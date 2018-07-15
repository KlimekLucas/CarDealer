package sda.Komis.Komis.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Sell extends BaseModel{

    private Client client;
    private Worker worker;
    private Vehicle vehicle;
    private String invoice;



}
