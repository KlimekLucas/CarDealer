package sda.Komis.Komis.dto;

import sda.Komis.Komis.model.Client;
import sda.Komis.Komis.model.Vehicle;
import sda.Komis.Komis.model.Worker;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class SellDto {

    private String client;

    private String worker;

    private String vehicle;

    private String sellingDate;
    @NotNull(message = "Pole nie może być puste")
    @Min(value = 5000, message = "Cena musi wynosić min 5000")
    private Integer price;

    private String agreement;

    private String invoice;


    public SellDto() {
    }

    public SellDto(String client, String worker, String vehicle, String sellingDate, Integer price, String agreement, String invoice) {
        this.client = client;
        this.worker = worker;
        this.vehicle = vehicle;
        this.sellingDate = sellingDate;
        this.price = price;
        this.agreement = agreement;
        this.invoice = invoice;
    }


    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getWorker() {
        return worker;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer  price) {
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
