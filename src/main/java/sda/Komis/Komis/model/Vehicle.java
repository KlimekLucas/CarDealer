package sda.Komis.Komis.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
public class Vehicle extends BaseModel  implements Serializable {


    private Integer ProductionDate;

    @OneToOne
    @JoinColumn(name = "manufacturerId")
    private Manufacturer manufacturer;
    private String model;
    private String OCNumber;
    //  @Column (name = "numer_rejestracyny")
    private String IDNumber;

    @ManyToOne
    @JoinColumn(name = "fuelId")
    private Fuel fuel;

    private Integer milage;
    private String engine;
    private String power;
    private String gearbox;
    private String desctipton;
    private Integer TestDrives;
    private Integer boughtPrice;
    private boolean sold;


    public Vehicle(Integer productionDate, Manufacturer manufacturer, String model, String OCNumber, String IDNumber, Fuel fuel, Integer milage, String engine, String power, String gearbox, String desctipton, Integer testDrives, Integer boughtPrice, boolean sold) {
        this.ProductionDate = productionDate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.OCNumber = OCNumber;
        this.IDNumber = IDNumber;
        this.fuel = fuel;
        this.milage = milage;
        this.engine = engine;
        this.power = power;
        this.gearbox = gearbox;
        this.desctipton = desctipton;
        this.TestDrives = testDrives;
        this.boughtPrice = boughtPrice;
        this.sold = sold;
    }




    public Vehicle() {

    }


    public Integer getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(Integer productionDate) {
        ProductionDate = productionDate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOCNumber() {
        return OCNumber;
    }

    public void setOCNumber(String OCNumber) {
        this.OCNumber = OCNumber;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Integer getMilage() {
        return milage;
    }

    public void setMilage(Integer milage) {
        this.milage = milage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public String getDesctipton() {
        return desctipton;
    }

    public void setDesctipton(String desctipton) {
        this.desctipton = desctipton;
    }

    public Integer getTestDrives() {
        return TestDrives;
    }

    public void setTestDrives(Integer testDrives) {
        TestDrives = testDrives;
    }

    public Integer getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(Integer boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}