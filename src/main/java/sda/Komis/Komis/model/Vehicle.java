package sda.Komis.Komis.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Year;


@Entity
@Data
public class Vehicle extends BaseModel  implements Serializable {


    private Integer ProductionDate;
    private String manufacturer;
    private String model;
    private String OCNumber;
    //  @Column (name = "numer_rejestracyny")
    private String IDNumber;

    @ManyToOne
    private Fuel fuel;

    private Integer milage;
    private String engine;
    private String power;
    private String gearbox;
    private String desctipton;
    private Integer TestDives;
    private boolean sold;


    public Vehicle() {
    }

    public Vehicle(Integer productionDate, String manufacturer, String model, String OCNumber, String IDNumber, Fuel fuel, Integer milage, String engine, String power, String gearbox, String desctipton, Integer testDives, boolean sold) {
        ProductionDate = productionDate;
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
        TestDives = testDives;
        this.sold = sold;
    }


    public Integer getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(Integer productionDate) {
        ProductionDate = productionDate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
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

    public Integer getTestDives() {
        return TestDives;
    }

    public void setTestDives(Integer testDives) {
        TestDives = testDives;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }
}




