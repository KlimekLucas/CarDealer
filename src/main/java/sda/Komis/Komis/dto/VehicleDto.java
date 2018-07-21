package sda.Komis.Komis.dto;

import sda.Komis.Komis.model.Fuel;

import java.time.Year;

public class VehicleDto {
    private String ProductionDate;
    private Integer manufacturer;
    private String model;
    private String OCNumber;
    //  @Column (name = "numer_rejestracyny")
    private String IDNumber;
    private String fuel;
    private String milage;
    private String engine;
    private String power;
    private String gearbox;
    private String desctipton;
    private String TestDrives;
    private String sold;


    public VehicleDto() {
    }

    public String getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(String productionDate) {
        ProductionDate = productionDate;
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
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

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getMilage() {
        return milage;
    }

    public void setMilage(String milage) {
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

    public String getTestDrives() {
        return TestDrives;
    }

    public void setTestDrives(String testDrives) {
        TestDrives = testDrives;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }
}
