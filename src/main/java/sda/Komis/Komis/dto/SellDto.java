package sda.Komis.Komis.dto;

import javax.validation.constraints.*;

public class SellDto {
    @NotEmpty(message = "Pole nie może być puste")
    private String client;
    @NotEmpty(message = "Pole nie może być puste")
    private String worker;
    @NotEmpty(message = "Pole nie może być puste")
    private String vehicle;
    @NotEmpty(message = "Pole nie może być puste")
    private String sellingDate;
    @NotNull(message = "Pole nie może być puste")
    @Min(value = 5000, message = "Cena nie może być mniejsza niż 5000")
    private Integer price;
    @NotEmpty(message = "Pole nie może być puste")
    private String agreement;
    @NotBlank(message = "pole nie moze byc puste")
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
