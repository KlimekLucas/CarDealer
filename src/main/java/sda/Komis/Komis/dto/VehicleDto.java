package sda.Komis.Komis.dto;

import javax.validation.constraints.NotBlank;

public class VehicleDto {
    @NotBlank(message = "pole nie moze byc puste")
    private String ProductionDate;
    @NotBlank(message = "pole nie moze byc puste")
    private Integer manufacturer;
    @NotBlank(message = "pole nie moze byc puste")
    private String model;
    @NotBlank(message = "pole nie moze byc puste")
    private String OCNumber;
    @NotBlank(message = "pole nie moze byc puste")
    private String IDNumber;
    @NotBlank(message = "pole nie moze byc puste")
    private String fuel;
    @NotBlank(message = "pole nie moze byc puste")
    private String milage;
    @NotBlank(message = "pole nie moze byc puste")
    private String engine;
    @NotBlank(message = "pole nie moze byc puste")
    private String power;
    @NotBlank(message = "pole nie moze byc puste")
    private String gearbox;
    @NotBlank(message = "pole nie moze byc puste")
    private String desctipton;
    @NotBlank(message = "pole nie moze byc puste")
    private String TestDrives;

    private String boughtPrice;
    private String sold;

    public VehicleDto(String productionDate,Integer manufacturer,String model,String OCNumber,String IDNumber,String fuel,String milage,String engine,String power,String gearbox,String desctipton, String testDrives, String boughtPrice, String sold) {
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
        TestDrives = testDrives;
        this.boughtPrice = boughtPrice;
        this.sold = sold;
    }

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

    public String getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(String boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public String getSold() {
        return sold;
    }

    public void setSold(String sold) {
        this.sold = sold;
    }
}

