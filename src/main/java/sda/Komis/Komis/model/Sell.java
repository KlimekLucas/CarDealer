package sda.Komis.Komis.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Sell extends BaseModel implements Serializable{

    @OneToOne
    @JoinColumn(name = "clientId")
    private Client client;
    @OneToOne
    @JoinColumn(name = "workerId")
    private Worker worker;
    @OneToOne
    @JoinColumn(name = "vehicleId")
    private Vehicle vehicle;
    private Date sellingDate;
    private Integer price;
    private String agreement;
    private String invoice;


    public Sell() {
    }

    public Sell(Client client, Worker worker, Vehicle vehicle, Date sellingDate, Integer price, String agreement, String invoice) {
        this.client = client;
        this.worker = worker;
        this.vehicle = vehicle;
        this.sellingDate = sellingDate;
        this.price = price;
        this.agreement = agreement;
        this.invoice = invoice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(Date sellingDate) {
        this.sellingDate = sellingDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAgreement() {
        return agreement;
    }

    public void setAgreement(String agreement) {
        this.agreement = agreement;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
}
